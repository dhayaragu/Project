package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rms_waiter", catalog = "rmsdb")
public class Waiter {
	@Id
	@GeneratedValue
	@Column(name = "waiter_id")
	private String waiterId;
	@Column(name = "waiter_name")
	private String name;
	@Column(name = "password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWaiterId() {
		return waiterId;
	}

	public void setWaiterId(String waiterId) {
		this.waiterId = waiterId;
	}

	public String getName() {
		
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
