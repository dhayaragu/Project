package org.web.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "door_No")
	private String doorNo;
	@Column(name = "city")
	private String city;
	@Column(name = "pin_code")
	private String pinCode;

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pinCode;
	}

	public void setPincode(String pincode) {
		this.pinCode = pincode;
	}

}
