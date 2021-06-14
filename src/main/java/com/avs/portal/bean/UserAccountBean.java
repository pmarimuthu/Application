package com.avs.portal.bean;

import java.io.Serializable;
import java.sql.Date;
<<<<<<< HEAD
=======
import java.util.UUID;
>>>>>>> b030e04... initial commit

public class UserAccountBean implements Serializable {

	private static final long serialVersionUID = -3257037063714792210L;
	
<<<<<<< HEAD
	private UserBean user;
=======
	private UUID id;
>>>>>>> b030e04... initial commit

	private String password;
	
	private Boolean isVerified;
	
	private Boolean isActive;
	
	private Boolean isLocked;
	
	private Date updatedOn;

	public UserAccountBean() {

	}
	
	public UserAccountBean(UserBean user) {
<<<<<<< HEAD
		this.user = user;
	}

	public UserBean getUserBean() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
=======
		if(user != null)
			this.id = user.getId();
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
>>>>>>> b030e04... initial commit
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsVerified() {
<<<<<<< HEAD
		return isVerified;
=======
		return isVerified == null ? false : isVerified;
>>>>>>> b030e04... initial commit
	}

	public void setIsVerified(Boolean isVerified) {
		this.isVerified = isVerified;
	}

	public Boolean getIsActive() {
<<<<<<< HEAD
		return isActive;
=======
		return isActive == null ? false : isActive;
>>>>>>> b030e04... initial commit
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public Boolean getIsLocked() {
<<<<<<< HEAD
		return isLocked;
=======
		return isLocked == null ? false : isLocked;
>>>>>>> b030e04... initial commit
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
<<<<<<< HEAD
		return "UserAccountBean [user=" + user + ", password=" + password + ", isVerified=" + isVerified + ", isActive="
				+ isActive + ", isLocked=" + isLocked + ", updatedOn=" + updatedOn + "]";
	}
	
	
	
=======
		return "UserAccountBean [id=" + id + ", password=" + password + ", isVerified=" + isVerified + ", isActive="
				+ isActive + ", isLocked=" + isLocked + ", updatedOn=" + updatedOn + "]";
	}
	
>>>>>>> b030e04... initial commit
}
