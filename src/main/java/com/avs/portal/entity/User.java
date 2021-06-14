package com.avs.portal.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.avs.portal.bean.UserBean;
import com.avs.portal.enumtype.Role;

@Entity
@Table(schema = "AVSPORTAL", name = "PORTAL_USER")
public class User {

	@Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID", updatable = false, nullable = false)
	private UUID id;
	
	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;
	
	@Column(name = "PHONE", nullable = false, unique = true)
	private Long phone;
	
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToOne(optional = true)
	@JoinColumn(name = "REFERRED_BY")
	private User referredBy;
	
	@Column(name = "LAST_LOGIN_ON")
	private Timestamp lastLoginOn;
	
	@Column(name = "UPDATED_ON")
	private Date updatedOn;

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

	public User getReferredBy() {
		return referredBy;
	}

	public void setReferredBy(User referredBy) {
		this.referredBy = referredBy;
	}

	public Timestamp getLastLoginOn() {
		return lastLoginOn;
	}

	public void setLastLoginOn(Timestamp lastLoginOn) {
		this.lastLoginOn = lastLoginOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}	

	public UserBean toBean() {
		UserBean bean = new UserBean();
		bean.setId(id);
		bean.setEmail(email);
		bean.setPhone(phone);
		bean.setRole(role);
		
		if(referredBy != null)
			bean.setReferredBy(referredBy.toBean());
		
		bean.setLastLoginOn(lastLoginOn);
		bean.setUpdatedOn(updatedOn);
		
		return bean;
	}
}
