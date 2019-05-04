package com.example.payments.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
@EntityListeners(AuditingEntityListener.class)
public class Payments {
	
	 private long paymentId;
	 private String cusId;
	 private String cardId;
	 private Date pay_datatime;
	 private double amount;
	 private String method;
	 private String cardNo;
	 private boolean result;
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	
	@Column(name="cusId" , nullable = false)
	public String getCusId() {
		return cusId;
	}
	public void setCusId(String cusId) {
		this.cusId = cusId;
	}
	
	@Column(name="cardId" , nullable=false)
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	@Column( name="pay_datatime" , nullable = false)
	@CreatedDate
	public Date getPay_datatime() {
		return pay_datatime;
	}
	public void setPay_datatime(Date pay_datatime) {
		this.pay_datatime = pay_datatime;
	}
	
	@Column(name="amount" , nullable = false)
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Column(name="method" , nullable=false)
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	
	@Column(name="cardNo")
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	
	
	@Column(name="result" , nullable=false)
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}

	 
	 
}
