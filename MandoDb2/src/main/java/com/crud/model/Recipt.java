package com.crud.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


@Document("recipt")
public class Recipt {

	  @Id
	  private int id;
	  @DateTimeFormat(pattern = "yyyy-MM-dd")
	  private String reciptDate;
	  @DateTimeFormat(pattern = "yyyy-MM-dd")
	  private String nextDueDate;
	  private double paidTutionFee;
	  private double paidAddmissionFee;
	  private double paidBusFee;	 
	  private double totalPaidFee;
	  private double totalDueFee;
	  
	  private Student student;
	  private FeeMaster feemaster;
	  
	public Recipt() {
		super();
	
	}

	public Recipt(int id, String reciptDate, String nextDueDate, double paidTutionFee, double paidAddmissionFee,
			double paidBusFee, double totalPaidFee, double totalDueFee, Student student, FeeMaster feemaster) {
		super();
		this.id = id;
		this.reciptDate = reciptDate;
		this.nextDueDate = nextDueDate;
		this.paidTutionFee = paidTutionFee;
		this.paidAddmissionFee = paidAddmissionFee;
		this.paidBusFee = paidBusFee;
		this.totalPaidFee = totalPaidFee;
		this.totalDueFee = totalDueFee;
		this.student = student;
		this.feemaster = feemaster;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReciptDate() {
		return reciptDate;
	}

	public void setReciptDate(String reciptDate) {
		this.reciptDate = reciptDate;
	}

	public String getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(String nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	public double getPaidTutionFee() {
		return paidTutionFee;
	}

	public void setPaidTutionFee(double paidTutionFee) {
		this.paidTutionFee = paidTutionFee;
	}

	public double getPaidAddmissionFee() {
		return paidAddmissionFee;
	}

	public void setPaidAddmissionFee(double paidAddmissionFee) {
		this.paidAddmissionFee = paidAddmissionFee;
	}

	public double getPaidBusFee() {
		return paidBusFee;
	}

	public void setPaidBusFee(double paidBusFee) {
		this.paidBusFee = paidBusFee;
	}

	public double getTotalPaidFee() {
		return totalPaidFee;
	}

	public void setTotalPaidFee(double totalPaidFee) {
		this.totalPaidFee = totalPaidFee;
	}

	public double getTotalDueFee() {
		return totalDueFee;
	}

	public void setTotalDueFee(double totalDueFee) {
		this.totalDueFee = totalDueFee;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public FeeMaster getFeemaster() {
		return feemaster;
	}

	public void setFeemaster(FeeMaster feemaster) {
		this.feemaster = feemaster;
	}

	@Override
	public String toString() {
		return "Recipt [id=" + id + ", reciptDate=" + reciptDate + ", nextDueDate=" + nextDueDate + ", paidTutionFee="
				+ paidTutionFee + ", paidAddmissionFee=" + paidAddmissionFee + ", paidBusFee=" + paidBusFee
				+ ", totalPaidFee=" + totalPaidFee + ", totalDueFee=" + totalDueFee + ", student=" + student
				+ ", feemaster=" + feemaster + "]";
	}
	  
	
	  
	
          
	
	  
	  
	  
	
}
