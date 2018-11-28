package com.cg.plp.dao;

import com.cg.plp.dto.Customer;
import com.cg.plp.dto.Merchant;

public interface RegDao {
	public Customer createAccount(Customer c);
	public Merchant createMerchantAccount(Merchant m);
}
