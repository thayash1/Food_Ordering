package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;


@Table(name = "cart")
public class CartItem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String menuName;
	private double price;
	private String uuid;
	
	private Item order_items;
	
	public CartItem(String menuName, double price, String uuid) {
		this.menuName = menuName;
		this.price = price;
		this.uuid = uuid;
	}
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	@ManyToOne(targetEntity = Item.class)
	public Item getOrder() {
		return order_items;
	}

	public void setOrder(Item order_items) {
		this.order_items = order_items;
	}
	
	

}
