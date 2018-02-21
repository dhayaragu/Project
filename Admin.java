package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
@Entity
@Table(name = "rms_admin", catalog = "rmsdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "mobile_no", name = "rms_admin_mobile_unq") })
public class Admin {
	@Id
	@Column(name = "user_name")
	private String name;
	@Column(name = "password")
	private String password;
	@Column(name = "Email")
	private String email;
	@Column(name = "mobile_no")
	private String mobilenumber;
	@Column(name = "code")
	private String code="";
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

}
