package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuItemController {

	@Autowired
	MenuItemService MenuitemService;
		
	@RequestMapping(value = "/showAllMenu", method = RequestMethod.GET)
	public List<MenuItem> showItem(){
		return MenuitemService.getAllMenuItem();
	}
		
	@RequestMapping(value = "/addMenuItem", method = RequestMethod.POST)
	public String add(@RequestBody MenuItem menuItem) {
		return MenuitemService.addMenuItem(menuItem);
	}
		
	@RequestMapping(value = "/test")
	public String test() {
		return "Test";
	}

}
