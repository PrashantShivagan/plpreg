package com.cg.plp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.plp.dto.Customer;
import com.cg.plp.dto.Merchant;
import com.cg.plp.service.RegService;

@Controller
public class RegContoller {
	
	@Autowired
	RegService RegSer;
	 
	
	String a;
	
	@RequestMapping(value="home")
	public String login(){
	return "home";
	}
	
	
	
	
	
	
	
	@RequestMapping(value = "customer")
	public String addCustomer(@ModelAttribute("my") Customer c) {
	
			
		
		
		System.out.println("Redirecting to customer registration page....");
		
		return "customer";
	}
	
	@RequestMapping(value = "success", method=RequestMethod.POST)
	public ModelAndView success(@ModelAttribute("my") Customer c) {
		System.out.println(c);
		System.out.println("Redirecting to success page....");
		Customer c1=RegSer.createAccount(c);
		System.out.println(c1);
		
		return new ModelAndView("success", "data", c.getUserid());
	}
	
	
	@RequestMapping(value = "Merchant")
	public String addCustomer(@ModelAttribute("my") Merchant m) {
	
			
		
		
		System.out.println("Redirecting to merchant registration page....");
		
		return "Merchant";
	}
	
	@RequestMapping(value = "msuccess", method=RequestMethod.POST)
	public ModelAndView msuccess(@ModelAttribute("my") Merchant m) {
		System.out.println(m);
		System.out.println("Redirecting to success page....");
		Merchant m1=RegSer.createMerchantAccount(m);
		System.out.println(m1);
		
		return new ModelAndView("msuccess", "data", m.getMerchantid());
	}
	
}
