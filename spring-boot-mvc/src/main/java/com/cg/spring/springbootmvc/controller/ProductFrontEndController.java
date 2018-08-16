package com.cg.spring.springbootmvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.spring.springbootmvc.bean.Product;

@RestController
public class ProductFrontEndController {

	@RequestMapping("/products")
	public Product getProduct(@RequestParam String id) {

		RestTemplate rtemp = new RestTemplate();
		Product p = rtemp.getForObject("http://localhost:9090/getproducts/?id=" + id, Product.class);

		return p;
	}
}
