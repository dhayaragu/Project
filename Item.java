package org.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "rms_items", catalog = "rmsdb")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "my_sequence", allocationSize=1 , initialValue =500)
	@Column(name = "item_id")
	private Integer itemId;
	@Column(name = "item_name")
	private String itemName;
	@Column(name = "item_type")
	private String itemType;
	@Column(name = "item_price")
	private String itemPrice;
	@Column(name = "item_category")
	private String itemCategory;
	@Column(name = "item_quantity")
	private Integer itemQuantity;
	
	public String getItemType() {
		return itemType;
	}



	public void setItemType(String itemType) {
		this.itemType = itemType;
	}



	
	
	
	
	

	
	public Integer getItemQuantity() {
		return itemQuantity;
	}



	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}



	public Integer getItemId() {
		return itemId;
	}

	

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
}
