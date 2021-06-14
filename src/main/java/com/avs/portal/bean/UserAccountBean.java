package com.avs.portal.bean;

import java.io.Serializable;
import java.sql.Date;

public class UserAccountBean implements Serializable {

	private static final long serialVersionUID = -3257037063714792210L;
	
	private UserBean user;

	private String password;
	
	private Boolean isVerified;
	
	private Boolean isActive;
	
	private Boolean isLocked;
	
	private Date updatedOn;

	public UserAccountBean() {

	}
	
	public UserAccountBean(UserBean user) {
		this.user = user;
	}

	public UserBean getUserBean() {
		return user;
	}

	public void setUser(UserBean user) {
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

	@Override
	public String toString() {
		return "UserAccountBean [user=" + user + ", password=" + password + ", isVerified=" + isVerified + ", isActive="
				+ isActive + ", isLocked=" + isLocked + ", updatedOn=" + updatedOn + "]";
	}
	
	
	
}
