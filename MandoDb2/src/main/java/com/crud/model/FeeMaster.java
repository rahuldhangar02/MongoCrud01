package com.crud.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("feemaster")
public class FeeMaster {

	@Id
	private int id;
	private String className;
	private String session;
	private double tutionFee;
	private double admissionFee;
	private double busFee;
	private double totalFee;
	
	
	public FeeMaster() {
		
	}


	public FeeMaster(int id, String className, String session, double tutionFee, double admissionFee, double busFee,
			double totalFee) {
		super();
		this.id = id;
		this.className = className;
		this.session = session;
		this.tutionFee = tutionFee;
		this.admissionFee = admissionFee;
		this.busFee = busFee;
		this.totalFee = totalFee;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getClassName() {
		return className;
	}


	public void setClassName(String className) {
		this.className = className;
	}


	public String getSession() {
		return session;
	}


	public void setSession(String session) {
		this.session = session;
	}


	public double getTutionFee() {
		return tutionFee;
	}


	public void setTutionFee(double tutionFee) {
		this.tutionFee = tutionFee;
	}


	public double getAdmissionFee() {
		return admissionFee;
	}


	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}


	public double getBusFee() {
		return busFee;
	}


	public void setBusFee(double busFee) {
		this.busFee = busFee;
	}


	public double getTotalFee() {
		return totalFee;
	}


	public void setTotalFee(double totalFee) {
		this.totalFee = totalFee;
	}


	@Override
	public String toString() {
		return "FeeMaster [id=" + id + ", className=" + className + ", session=" + session + ", tutionFee=" + tutionFee
				+ ", admissionFee=" + admissionFee + ", busFee=" + busFee + ", totalFee=" + totalFee + "]";
	}
	
	
	
}
