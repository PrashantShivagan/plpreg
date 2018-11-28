package com.cg.plp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.plp.dto.Customer;
import com.cg.plp.dto.Merchant;



@Repository("RegDao1")
public class RegDaoImpl implements RegDao {
   
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public Customer createAccount(Customer c) {
		System.out.println(c);
		
		em.persist(c);
		em.flush();
		System.out.println(c);
		
		return c;
	}


	@Override
	public Merchant createMerchantAccount(Merchant m) {
System.out.println(m);
		
		em.persist(m);
		em.flush();
		System.out.println(m);
		
		return m;
	}

}
