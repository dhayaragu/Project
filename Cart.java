package org.web.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rms_cart", catalog = "rmsdb")
public class Cart {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer Id;
	
	@Column(name = "item_quantity")
	private Integer quantity;
	
	@Column(name = "item_id")
	private Integer itemId;
	
	@OneToOne
	@JoinColumn(name = "cart_username_fk")
	private Users user;
	
	@Column(name = "total_price")
	private double total_price;
	
	@Column(name = "bill_status")
	private String status;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	
	
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getTotal_price() {
		return total_price;
	}
	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}
	
}
