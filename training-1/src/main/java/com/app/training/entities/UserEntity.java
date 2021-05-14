package com.app.training.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity implements Serializable {

	private static final long serialVersionUID = -3524516996943309183L;
	
	@Id
	@GeneratedValue
	private long id;
	

	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false,length = 50)
	private String username;

	@Column(nullable = false,length = 120)
	private String email;
	

	@Column(nullable = false)
	private String EncryptedPassword;
	

	@Column(nullable = true)
	private String EmailVerificationToken;
	

	@Column(nullable = false)
	private Boolean EmailVerificationStatus = false;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
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


	public String getEncryptedPassword() {
		return EncryptedPassword;
	}


	public void setEncryptedPassword(String encryptedPassword) {
		EncryptedPassword = encryptedPassword;
	}


	public String getEmailVerificationToken() {
		return EmailVerificationToken;
	}


	public void setEmailVerificationToken(String emailVerificationToken) {
		EmailVerificationToken = emailVerificationToken;
	}


	public Boolean getEmailVerificationStatus() {
		return EmailVerificationStatus;
	}


	public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
		EmailVerificationStatus = emailVerificationStatus;
	}

	
	

}
