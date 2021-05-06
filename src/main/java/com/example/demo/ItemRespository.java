package com.example.demo;

import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;


@Repository
public interface ItemRespository extends CrudRepository<Item, Integer>{
	public boolean existsById(Integer menuid);
}
