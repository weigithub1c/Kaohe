package com.hand.ssm.mapper;

import java.util.List;

import com.hand.ssm.dto.Customer;
import com.hand.ssm.dto.Customer;

public interface CustomerMapper {
    public List<Customer> selectLogin(Customer customer);
    
    public List<Customer> selectAll(Customer customer);
    
    public int insert(Customer customer);
    
    public int delete(Customer customer);
    
    public String selectOne(Customer customer);

	public List<Customer> selectAddress(Customer customer);
	
	public int selectAid(Customer customer);
	
	public int update(Customer customer);
    
}
