package com.hand.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.ssm.dto.Customer;
import com.hand.ssm.mapper.CustomerMapper;
import com.hand.ssm.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired(required=true)
	private CustomerMapper customerMapper;


	public List<Customer> selectLogin(Customer customer) {
		List<Customer> customerList=customerMapper.selectLogin(customer);
		return customerList;
	}


	public List<Customer> selectAll(Customer customer) {
		List<Customer> customerList1=customerMapper.selectAll(customer);
		return customerList1;
	}


	public int insert(Customer customer) {
		int cl2 = customerMapper.insert(customer);
		return cl2;
	}


	public int delete(Customer customer) {
		int cl3 = customerMapper.delete(customer);
		return cl3;
	}

	public String selectOne(Customer customer) {
		String c4 = customerMapper.selectOne(customer);
		return c4;
	}


	public List<Customer> selectAddress(Customer customer) {
		List<Customer> c5 = customerMapper.selectAddress(customer);
		return c5;
	}


	public int selectAid(Customer customer) {
		int c6 = customerMapper.selectAid(customer);
		return c6;
	}


	public int update(Customer customer) {
		int c7 = customerMapper.update(customer);
		return c7;
	}
	
}
