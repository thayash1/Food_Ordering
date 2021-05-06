package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public List<Item> showItem(){
		return (List<Item>) itemService.getAllItem();
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@RequestBody Item order) {
		return itemService.addItem(order);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public void update(@RequestBody Item order) {
		itemService.updateStatus(order);
	}
	
	@RequestMapping(value = "/cancel", method = RequestMethod.DELETE)
	public String cancel(@RequestBody Item order) {
		return itemService.cancelItem(order);
	}

}
