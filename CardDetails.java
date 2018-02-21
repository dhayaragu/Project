package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "rms_carddetails", catalog = "rmsdb")
public class CardDetails {
	@Id
	@Column(name = "account_no")
	private long accountNo;
	@Column(name = "exp_month")
	private int expMonth;
	@Column(name = "exp_year")
	private int expYear;
	@Column(name = "card_holder_name")
	private String cardHolderName;
	@OneToOne
	@JoinColumn(name = "carddetails_customername_fk")
	private Users user;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public int getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(int expMonth) {
		this.expMonth = expMonth;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
}
