package com.example.demo.controller;

import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;

    @GetMapping("/patient")
    public String index() {
        return "Welcome to spring boot crud application !!!!";
    }
    
    
    @PostMapping("/savePatient")
    public Patient saveData(@RequestBody Patient patient) {
    	patientRepository.save(patient);
        return patient;
    }
    
    @GetMapping("/getAllPatient")
    public List<Patient> getAll() {
        List<Patient> patientList = patientRepository.findAll();
        return patientList;
    }
    
    @DeleteMapping("/deletepatient/{rollNo}")
    public String deletePatient(@PathVariable int rollNo) {
    	Patient patient = patientRepository.findById(rollNo).get();
        if(patient != null)
        	patientRepository.delete(patient);
        return "Deleted successfully!!";
    }

    @PutMapping("/updatePatient")
    public Patient updatePatientData(@RequestBody Patient patient) {
    	patientRepository.save(patient);
        return patient;
    }

    @GetMapping("/getPatient/{rollNo}")
    public Patient getPatientData(@PathVariable int rollNo) {
        Optional<Patient> patient = patientRepository.findById(rollNo);
        Patient patient1 = patient.get();
        return patient1;
    }
}