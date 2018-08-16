package com.capgemini.ProjectDemo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.ProjectDemo.bean.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer>{

	
	
}
