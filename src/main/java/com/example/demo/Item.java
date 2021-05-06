package com.example.demo;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import lombok.Data;

//model

@Entity
@Table(name = "item")
public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@OneToMany(targetEntity=CartItem.class, mappedBy = "order_items")
	private List<CartItem> cart;
	private int time;
	private String name;
	private String phoneNumber;
	private String itemStatus;
	private int uuid;
	
	public Item() {
		
	}

	public Item(int time, String name, String phoneNumber, String itemStatus, int uuid) {
		cart = new ArrayList<CartItem>();
		this.time = time;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.itemStatus = itemStatus;
		this.uuid = uuid;
	}
	
	public List<CartItem> getList(){
		return cart;
	}
	
	public Integer getId() {
		return uuid;
	}
	
	public void setId(int uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getStatus() {
		return itemStatus;
	}
	
	public void setStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
	
	
	
}
