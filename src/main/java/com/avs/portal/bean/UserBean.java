package com.avs.portal.bean;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

import com.avs.portal.enumtype.Role;

public class UserBean implements Serializable {

	private static final long serialVersionUID = -1989459185518317469L;
	
	private UUID id;
	
	private String email;
	
	private Long phone;
	
	private Role role;
	
	private UserBean referredBy;
	
	private Timestamp lastLoginOn;
	
	private Timestamp createdOn;
	
	private Date updatedOn;
	
	public UserBean() {
		
	}
	
	public UserBean(String uuid) {
		this.id = UUID.fromString(uuid);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public UserBean getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(UserBean referredBy) {
		this.referredBy = referredBy;
	}

	public Timestamp getLastLoginOn() {
		return lastLoginOn;
	}

	public void setLastLoginOn(Timestamp lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", email=" + email + ", phone=" + phone + ", role=" + role + ", referredBy="
				+ referredBy + ", lastLoginOn=" + lastLoginOn + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
				+ "]";
	}


	
}
