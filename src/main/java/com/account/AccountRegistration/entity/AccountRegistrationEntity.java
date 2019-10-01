package com.account.AccountRegistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountRegistrationEntity {
	
	@Id
	@Column(name= "user_id")
	private String userId;
	
	@Column(name= "username")
	private String userName;
	
	@Column(name ="password")
	private String password;
	
	@Column(name="email")
	private String email;

	
	@Override
	public String toString() {
		return "AccountRegistrationEntity [userId=" + userId + ", userName=" + userName + ", password=" + password
				+ ", email=" + email + "]";
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
