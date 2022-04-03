package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Order {

	private Long id;
	private Customer customerId;
	private Item itemName;
	private String dateOrdered;
	private List<Item> ordersItems = new ArrayList<>();
	
	
	
	
	public Order(Long id, Customer customerId, Item itemName, String dateOrdered) {
		super();
		this.setId(id);
		this.setCustomerId(customerId);
		this.setItemName(itemName);
		this.setDateOrdered(dateOrdered);
	}
	
	public Order(Customer customerId) {
		this.setCustomerId(customerId);
	}

	public Order(Long id, Customer customerId) {
		this.setId(id);
		this.setCustomerId(customerId);
	}
	
	public Order(Long id, List<Item> ordersItems) {
		super();
		this.id = id;
		this.setOrdersItems(ordersItems);
	}
	
	



	public Order(Long id, Customer customer, double totalPrice, Long customer_id, List<Item> itemList) {
		
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	public Item getItemName() {
		return itemName;
	}
	public void setItemName(Item itemName) {
		this.itemName = itemName;
	}
	public String getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(String dateOrdered) {
		this.dateOrdered = dateOrdered;
	}

	public List<Item> getOrdersItems() {
		return ordersItems;
	}

	public void setOrdersItems(List<Item> ordersItems) {
		this.ordersItems = ordersItems;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", itemName=" + itemName + ", dateOrdered="
				+ dateOrdered + ", ordersItems=" + ordersItems + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerId, dateOrdered, id, itemName, ordersItems);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(dateOrdered, other.dateOrdered)
				&& Objects.equals(id, other.id) && Objects.equals(itemName, other.itemName)
				&& Objects.equals(ordersItems, other.ordersItems);
	}

	
	
}
