package com.payments.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="ship")
@EntityListeners(AuditingEntityListener.class)
public class Shipp {

	private long shipId;
	private long orderId;
	private Date date_shipped;
	private double shipping_amount;
	private boolean result;
	private Date updatedAt;
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	public long getShipId() {
		return shipId;
	}
	public void setShipId(long shipId) {
		this.shipId = shipId;
	}
	
	
	@Column( name="orderId" , nullable=false)
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	
	@Column( name="date_shipped" , nullable = true)
	public Date getDate_shipped() {
		return date_shipped;
	}
	public void setDate_shipped(Date date_shipped) {
		this.date_shipped = date_shipped;
	}
	@Column( name="shipping_amount" , nullable = true)
	public double getShipping_amount() {
		return shipping_amount;
	}
	public void setShipping_amount(double shipping_amount) {
		this.shipping_amount = shipping_amount;
	}
	
	@Column( name = "result" , nullable= true)
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	

	@Column(name = "updated_at", nullable = true)
    @LastModifiedDate
	 public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
