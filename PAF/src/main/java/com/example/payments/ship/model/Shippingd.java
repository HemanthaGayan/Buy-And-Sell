package com.example.payments.ship.model;
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
@Table(name = "Shippingd")
@EntityListeners(AuditingEntityListener.class)
public class Shippingd {
	
	
	private long shipmentId;
	private String cartId;
	private Date date_shipped;
	private double shipping_amount;
	private boolean result;
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	public long getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(long shipmentId) {
		this.shipmentId = shipmentId;
	}
	
	@Column( name="cartId" , nullable=false)
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	
	@Column( name="date_shipped" , nullable = false)
	public Date getDate_shipped() {
		return date_shipped;
	}
	public void setDate_shipped(Date date_shipped) {
		this.date_shipped = date_shipped;
	}
	
	@Column( name="shipping_amount" , nullable = false)
	public double getShipping_amount() {
		return shipping_amount;
	}
	public void setShipping_amount(double shipping_amount) {
		this.shipping_amount = shipping_amount;
	}
	
	@Column( name = "result" , nullable= false)
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	
	
	

}
