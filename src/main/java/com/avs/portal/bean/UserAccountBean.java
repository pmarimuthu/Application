package com.avs.portal.bean;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

public class UserAccountBean implements Serializable {

	private static final long serialVersionUID = -3257037063714792210L;
	
	private UUID id;

	private String password;
	
	private Boolean isVerified;
	
	private Boolean isActive;
	
	private Boolean isLocked;
	
	private Date updatedOn;

	public UserAccountBean() {

	}
	
	public UserAccountBean(UserBean user) {
		if(user != null)
			this.id = user.getId();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsVerified() {
		return isVerified == null ? false : isVerified;
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public Boolean getIsActive() {
		return isActive == null ? false : isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsLocked() {
		return isLocked == null ? false : isLocked;
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
		return "UserAccountBean [id=" + id + ", password=" + password + ", isVerified=" + isVerified + ", isActive="
				+ isActive + ", isLocked=" + isLocked + ", updatedOn=" + updatedOn + "]";
	}
	
}
