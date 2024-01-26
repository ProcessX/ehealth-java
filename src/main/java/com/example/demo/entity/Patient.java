package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Patient {
	@Id
	private int rollNo;
	private String FullName;
	private int Age;
	private String Description;
	private String BirthDate;
	private String Gender;

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int rollNo, String fullName, int age, String description, String birthDate, String gender,
			String contact, String insuranceNumber, String chronicConditions, String pastMedicalHistory,
			String medications, String familyMedicalHistory, String socialHistory) {
		super();
		this.rollNo = rollNo;
		FullName = fullName;
		Age = age;
		Description = description;
		BirthDate = birthDate;
		Gender = gender;
		Contact = contact;
		InsuranceNumber = insuranceNumber;
		ChronicConditions = chronicConditions;
		PastMedicalHistory = pastMedicalHistory;
		Medications = medications;
		FamilyMedicalHistory = familyMedicalHistory;
		SocialHistory = socialHistory;
	}

	@Override
	public String toString() {
		return "Patient [rollNo=" + rollNo + ", FullName=" + FullName + ", Age=" + Age + ", Description=" + Description
				+ ", BirthDate=" + BirthDate + ", Gender=" + Gender + ", Contact=" + Contact + ", InsuranceNumber="
				+ InsuranceNumber + ", ChronicConditions=" + ChronicConditions + ", PastMedicalHistory="
				+ PastMedicalHistory + ", Medications=" + Medications + ", FamilyMedicalHistory=" + FamilyMedicalHistory
				+ ", SocialHistory=" + SocialHistory + "]";
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getInsuranceNumber() {
		return InsuranceNumber;
	}

	public void setInsuranceNumber(String insuranceNumber) {
		InsuranceNumber = insuranceNumber;
	}

	public String getChronicConditions() {
		return ChronicConditions;
	}

	public void setChronicConditions(String chronicConditions) {
		ChronicConditions = chronicConditions;
	}

	public String getPastMedicalHistory() {
		return PastMedicalHistory;
	}

	public void setPastMedicalHistory(String pastMedicalHistory) {
		PastMedicalHistory = pastMedicalHistory;
	}

	public String getMedications() {
		return Medications;
	}

	public void setMedications(String medications) {
		Medications = medications;
	}

	public String getFamilyMedicalHistory() {
		return FamilyMedicalHistory;
	}

	public void setFamilyMedicalHistory(String familyMedicalHistory) {
		FamilyMedicalHistory = familyMedicalHistory;
	}

	public String getSocialHistory() {
		return SocialHistory;
	}

	public void setSocialHistory(String socialHistory) {
		SocialHistory = socialHistory;
	}

	private String Contact;
	private String InsuranceNumber;
	private String ChronicConditions;
	private String PastMedicalHistory;
	private String Medications;
	private String FamilyMedicalHistory;
	private String SocialHistory;

}
