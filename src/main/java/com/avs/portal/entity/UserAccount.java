package com.avs.portal.entity;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "AVSPORTAL", name = "USER_ACCOUNT")
public class UserAccount {

	@Id
	@Column(name = "ID", updatable = false, nullable = false)
	private UUID user;

	@Column(name = "PASSWORD", nullable = false)
	private String password;
	
	@Column(name = "IS_VERIFIED")
	private Boolean isVerified;
	
	@Column(name = "IS_ACTIVE")
	private Boolean isActive;
	
	@Column(name = "IS_LOCKED")
	private Boolean isLocked;
	
	@Column(name = "UPDATED_ON")
	private Date updatedOn;
	
	public UserAccount() {
		
	}
	
	public UserAccount(UUID user, String initialPassword) {
		this.user = user;
		this.password = initialPassword;
	}

	public UUID getUser() {
		return user;
	}

	public void setUser(UUID user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(Boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	
}
