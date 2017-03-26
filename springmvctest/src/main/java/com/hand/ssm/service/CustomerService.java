package com.hand.ssm.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hand.ssm.dto.Customer;



public interface CustomerService {
	List<Customer> selectLogin(Customer customer);
	
	List<Customer> selectAll(Customer customer);
	
	int insert(Customer customer);
	
	int delete(Customer customer);
	
	String selectOne(Customer customer);
	
	List<Customer> selectAddress(Customer customer);
	
	int selectAid(Customer customer);
	
	int update(Customer customer);
}
