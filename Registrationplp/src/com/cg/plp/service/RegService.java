package com.cg.plp.service;

import com.cg.plp.dto.Customer;
import com.cg.plp.dto.Merchant;



public interface RegService {
	
	public Customer createAccount(Customer c);
	public Merchant createMerchantAccount(Merchant m);

}
