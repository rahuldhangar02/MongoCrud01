package com.crud.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Address {

	
	private String street;
	private String landmark;
	private long pincode;
	private String state;
	private String country;
	
	
	public Address() {
		super();
		
	}

	
	

	public Address(String street, String landmark, long pincode, String state, String country) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.pincode = pincode;
		this.state = state;
		this.country = country;
	}




	

	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getLandmark() {
		return landmark;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public long getPincode() {
		return pincode;
	}


	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}




	@Override
	public String toString() {
		return "Address [ street=" + street + ", landmark=" + landmark + ", pincode=" + pincode
				+ ", state=" + state + ", country=" + country + "]";
	}
	
	
	   
}
