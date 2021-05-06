package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	ItemRespository itemRepository;
	
	public Iterable<Item> getAllItem(){
		return itemRepository.findAll();
	}
	
	public String addItem(Item order) {
		itemRepository.save(order);
		return "Placed the order successfully";
	}
	
	public String cancelItem(Item order) {
		if(itemRepository.existsById(order.getId())) {
			itemRepository.delete(order);
			return "Cancel the order successfully";
		}
		else {
			return "The order is not exist";
		}
	}
	
	public String checkStatus(Item order) {
		if(itemRepository.existsById(order.getId())) {
			return order.getStatus();
		}
		else {
			return "Error";
		}
	}
	
	public void updateStatus(Item order) {
		if(itemRepository.existsById(order.getId())) {
			if(order.getStatus().equals("Waiting")) {
				order.setStatus("preparing");
			}
			else if(order.getStatus().equals("preparing")) {
				order.setStatus("placed");
			}
		}
	}
	
	

}
