package org.web.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "rms_orders", catalog = "rmsdb")
public class Orders {
	@Id
	@GeneratedValue
	@Column(name = "order_id")
	private Integer orderId;

	@Column(name = "order_price")
	private double price;

	@ManyToOne
	@JoinColumn(name = "order_customerid_fk")
	private Users user;

	@ManyToOne
	@JoinColumn(name = "order_tableNumber_fk")
	private DinningTable table;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "rms_order_cart", joinColumns = @JoinColumn(name = "order_id"), inverseJoinColumns = @JoinColumn(name = "cart_id"))
	private List<Cart> cartItems;

	public DinningTable getTable() {
		return table;
	}

	public void setTable(DinningTable table) {
		this.table = table;
	}

	

	

	public List<Cart> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<Cart> cartItems) {
		this.cartItems = cartItems;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public double getPrice() {
		return price;
	}


	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

}
