package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuItemService {
	@Autowired
	MenuItemRespository menuItemRepository;
	
	public List<MenuItem> getAllMenuItem(){
		return (List<MenuItem>) menuItemRepository.findAll();
	}
	
	public String addMenuItem(MenuItem menuItem) {
		menuItemRepository.save(menuItem);
		return "Add the menu item";
	}
}

