package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface MenuItemRespository extends CrudRepository<MenuItem, Integer>{
	public boolean existsByName(String name);
}