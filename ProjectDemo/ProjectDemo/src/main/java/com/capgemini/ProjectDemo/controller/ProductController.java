package com.capgemini.ProjectDemo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.ProjectDemo.bean.Product;
import com.capgemini.ProjectDemo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;

	@RequestMapping("/getproducts")
	public Optional<Product> getProductById(@RequestParam int id) {

		return service.getProductById(id);

	}

}
