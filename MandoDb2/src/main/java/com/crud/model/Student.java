package com.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Student")
public class Student {

	@Id 
	private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String className;
    private String currentSession;
    private String email;
    private long contact;
    
    private Parents parents;
    
    private Address address;
    
    
    
    

	public Student() {
		super();
	
	}





	public Student(String firstName, String lastName, String gender, String className, String currentSession, String email,
			long contact, Parents parents, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.className = className;
		this.currentSession = currentSession;
		this.email = email;
		this.contact = contact;
		this.parents = parents;
		this.address = address;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getFirstName() {
		return firstName;
	}





	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}





	public String getLastName() {
		return lastName;
	}





	public void setLastName(String lastName) {
		this.lastName = lastName;
	}





	public String getGender() {
		return gender;
	}





	public void setGender(String gender) {
		this.gender = gender;
	}





	public String getClassName() {
		return className;
	}





	public void setClassName(String className) {
		this.className = className;
	}





	public String getCurrentSession() {
		return currentSession;
	}





	public void setCurrentSession(String currentSession) {
		this.currentSession = currentSession;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}





	public long getContact() {
		return contact;
	}





	public void setContact(long contact) {
		this.contact = contact;
	}















	public Parents getParents() {
		return parents;
	}





	public void setParents(Parents parents) {
		this.parents = parents;
	}





	public Address getAddress() {
		return address;
	}





	public void setAddress(Address address) {
		this.address = address;
	}





	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", className=" + className + ", currentSession=" + currentSession + ", email=" + email + ", contact="
				+ contact + ", parents=" + parents + ", address=" + address + "]";
	}
    
    
    
    
	
    
    
    
	
	
    
	
}
