package com.capgemini.ProjectDemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.ProjectDemo.bean.Product;
import com.capgemini.ProjectDemo.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo repo;
	
	
	@Override
	public Optional<Product> getProductById(int id) {
		
		return repo.findById(id);
	}

	

	
}
