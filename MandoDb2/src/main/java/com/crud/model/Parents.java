package com.crud.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Parents {

	
	private String fatherName;
	private long contact;
	private String fatherQualification;
	private String fatherOccuption;
	private String motherName;
	private String motherQualification;
	private String motherOccuption;
	private long alternateContact;
	
	
	
	
	public Parents() {
		super();
	
	}


	public Parents(String fatherName, long contact, String fatherQualification, String fatherOccuption,
			String motherName, String motherQualification, String motherOccuption, long alternateContact) {
		super();
		
		this.fatherName = fatherName;
		this.contact = contact;
		this.fatherQualification = fatherQualification;
		this.fatherOccuption = fatherOccuption;
		this.motherName = motherName;
		this.motherQualification= motherQualification;
		this.motherOccuption = motherOccuption;
		this.alternateContact = alternateContact;
	}




	public String getFatherName() {
		return fatherName;
	}


	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public String getFatherQualification() {
		return fatherQualification;
	}


	public void setFatherQualification(String fatherQualification) {
		this.fatherQualification = fatherQualification;
	}


	public String getFatherOccuption() {
		return fatherOccuption;
	}


	public void setFatherOccuption(String fatherOccuption) {
		this.fatherOccuption = fatherOccuption;
	}


	public String getMotherName() {
		return motherName;
	}


	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}


	public String getmotherQualification() {
		return motherQualification;
	}


	public void setMotherQulification(String motherQualification) {
		this.motherQualification = motherQualification;
	}


	public String getMotherOccuption() {
		return motherOccuption;
	}


	public void setMotherOccuption(String motherOccuption) {
		this.motherOccuption = motherOccuption;
	}


	public long getAlternateContact() {
		return alternateContact;
	}


	public void setAlternateContact(long alternateContact) {
		this.alternateContact = alternateContact;
	}


	@Override
	public String toString() {
		return "Parents [fatherName=" + fatherName + ", contact=" + contact + ", fatherQualification="
				+ fatherQualification + ", fatherOccuption=" + fatherOccuption + ", motherName=" + motherName
				+ ", motherQualification=" + motherQualification + ", motherOccuption=" + motherOccuption
				+ ", alternateContact=" + alternateContact + "]";
	}
	
	
	
	
}
