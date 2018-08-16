package com.capgemini.ProjectDemo.service;

import java.util.Optional;

import com.capgemini.ProjectDemo.bean.Product;

public interface ProductService {

	
	public Optional<Product> getProductById(int id);
	
}
