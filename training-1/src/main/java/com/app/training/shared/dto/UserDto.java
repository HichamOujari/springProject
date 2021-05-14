package com.app.training.shared.dto;

import java.io.Serializable;

public class UserDto implements Serializable {
	

	private static final long serialVersionUID = -5406569689557460589L;
	private long id;
	private String userId;
	private String username;
	private String email;
	private String password;
	private String EncryptedPassword;
	private String EmailVerificationToken;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
