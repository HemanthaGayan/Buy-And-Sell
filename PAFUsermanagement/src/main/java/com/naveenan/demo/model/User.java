package com.naveenan.demo.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "user")
@EntityListeners(AuditingEntityListener.class)
public class User {
	
	@Id
    private long id;
    private String username;
    private String email; 
    private String password;
    @Transient
    private String passwordConfirm;
    
	public User() {

	}
    
    public User(long id, String username, String email, String password, String passwordConfirm) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.passwordConfirm = passwordConfirm;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", passwordConfirm=" + passwordConfirm + "]";
	}
	
	
	
}
