package com.cg.spring.springbootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ProductJspController {
	
	
	

	@RequestMapping("/index")
	public String showProductByIdPage() {
		
		return "index";
	}
	
	
	/*@RequestMapping("/addcard")
	public void addCard() {
		
		
	}
	*/
	
	@RequestMapping("/PaymentMethod")
	public String showPayment() {
		
		return "PaymentMethod";
	}
	
	@RequestMapping("/Debit")
	public String showDebit() {
		
		return "Debit";
	}
	
	@RequestMapping("/Credit")
	public String showCredit() {
		
		return "Credit";
	}
	
	@RequestMapping("/Cod")
	public String showCod() {
		
		return "Cod";
	}
}
