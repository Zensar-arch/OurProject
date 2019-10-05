package com.zensar.mstdc.entities;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	private double roomCharge;
	private double miscCharge;
	private double totalCharge;
	@Column(nullable = false)
	private String creditCardNo;
	private String creditCardType;
	private int creditCardExpiryMonth;
	private int creditCardExpiryYear;
	@Column(nullable = false)
	private String debitDebitNo;
	private String debitCardType;
	private int deditCardExpiryMonth;
	private int deditCardExpiryYear;
	private LocalDate paymentDate;
	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customer;

	public Payment() {
		// TODO Auto-generated constructor stub
	}

	public Payment(int paymentId, double roomCharge, double miscCharge, double totalCharge, String creditCardNo,
			String creditCardType, int creditCardExpiryMonth, int creditCardExpiryYear, String debitDebitNo,
			String debitCardType, int deditCardExpiryMonth, int deditCardExpiryYear, LocalDate paymentDate,
			Customer customer) {
		super();
		this.paymentId = paymentId;
		this.roomCharge = roomCharge;
		this.miscCharge = miscCharge;
		this.totalCharge = totalCharge;
		this.creditCardNo = creditCardNo;
		this.creditCardType = creditCardType;
		this.creditCardExpiryMonth = creditCardExpiryMonth;
		this.creditCardExpiryYear = creditCardExpiryYear;
		this.debitDebitNo = debitDebitNo;
		this.debitCardType = debitCardType;
		this.deditCardExpiryMonth = deditCardExpiryMonth;
		this.deditCardExpiryYear = deditCardExpiryYear;
		this.paymentDate = paymentDate;
		this.customer = customer;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public double getRoomCharge() {
		return roomCharge;
	}

	public void setRoomCharge(double roomCharge) {
		this.roomCharge = roomCharge;
	}

	public double getMiscCharge() {
		return miscCharge;
	}

	public void setMiscCharge(double miscCharge) {
		this.miscCharge = miscCharge;
	}

	public double getTotalCharge() {
		return totalCharge;
	}

	public void setTotalCharge(double totalCharge) {
		this.totalCharge = totalCharge;
	}

	public String getCreditCardNo() {
		return creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public int getCreditCardExpiryMonth() {
		return creditCardExpiryMonth;
	}

	public void setCreditCardExpiryMonth(int creditCardExpiryMonth) {
		this.creditCardExpiryMonth = creditCardExpiryMonth;
	}

	public int getCreditCardExpiryYear() {
		return creditCardExpiryYear;
	}

	public void setCreditCardExpiryYear(int creditCardExpiryYear) {
		this.creditCardExpiryYear = creditCardExpiryYear;
	}

	public String getDebitDebitNo() {
		return debitDebitNo;
	}

	public void setDebitDebitNo(String debitDebitNo) {
		this.debitDebitNo = debitDebitNo;
	}

	public String getDebitCardType() {
		return debitCardType;
	}

	public void setDebitCardType(String debitCardType) {
		this.debitCardType = debitCardType;
	}

	public int getDeditCardExpiryMonth() {
		return deditCardExpiryMonth;
	}

	public void setDeditCardExpiryMonth(int deditCardExpiryMonth) {
		this.deditCardExpiryMonth = deditCardExpiryMonth;
	}

	public int getDeditCardExpiryYear() {
		return deditCardExpiryYear;
	}

	public void setDeditCardExpiryYear(int deditCardExpiryYear) {
		this.deditCardExpiryYear = deditCardExpiryYear;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", roomCharge=" + roomCharge + ", miscCharge=" + miscCharge
				+ ", totalCharge=" + totalCharge + ", creditCardNo=" + creditCardNo + ", creditCardType="
				+ creditCardType + ", creditCardExpiryMonth=" + creditCardExpiryMonth + ", creditCardExpiryYear="
				+ creditCardExpiryYear + ", debitDebitNo=" + debitDebitNo + ", debitCardType=" + debitCardType
				+ ", deditCardExpiryMonth=" + deditCardExpiryMonth + ", deditCardExpiryYear=" + deditCardExpiryYear
				+ ", paymentDate=" + paymentDate + "]";
	}

	
}
