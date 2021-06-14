package com.avs.portal.bean;

import java.io.Serializable;
import java.util.UUID;

public class LoginBean implements Serializable {

	private static final long serialVersionUID = 4858178880110583705L;

	private UUID id;

	private String email;

	private Long phone;

	private String password;

	private String resultCode;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	@Override
	public String toString() {
		return "LoginBean [id=" + id + ", email=" + email + ", phone=" + phone + ", password=" + password
				+ ", resultCode=" + resultCode + "]";
	}  

}
