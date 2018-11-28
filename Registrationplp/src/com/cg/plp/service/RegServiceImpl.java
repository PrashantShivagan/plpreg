package com.cg.plp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.RegDao;
import com.cg.plp.dto.Customer;
import com.cg.plp.dto.Merchant;
@Service("RegSer")
@Transactional
public class RegServiceImpl implements RegService {
	
	@Autowired
	RegDao RegDao1;
	@Override
	public Customer createAccount(Customer c) {
		
		
		c.setUserid();
		//c.setAge("0");
		System.out.println(c);
		return RegDao1.createAccount(c);
	}
	@Override
	public Merchant createMerchantAccount(Merchant m) {
		// TODO Auto-generated method stub
		m.setMerchantid();
		//c.setAge("0");
		System.out.println(m);
		return RegDao1.createMerchantAccount(m);
	}

}
