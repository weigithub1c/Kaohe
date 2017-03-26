package com.hand.ssm.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hand.ssm.dto.Customer;
import com.hand.ssm.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired(required=true)
	private CustomerService customerService;

	@RequestMapping("/login")
	public String login(Map<String, Object> map,HttpServletRequest request,HttpServletResponse response,Customer customer){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		customer.setUsername(username);
		customer.setPassword(password);
		List<Customer> list = customerService.selectLogin(customer);
		while(list.size() == 0){
			return"login.do";
		}

		Customer customer1 = new Customer();
		int page = 1;
		customer1.setCursor((page-1)*10);
		map.put("list",customerService.selectAll(customer1));
		request.getSession().setAttribute("username", username);
		return"index";
	}

	@RequestMapping(value="/xj",method=RequestMethod.POST)
	public String inseletAddress(Map<String, Object> map,HttpServletRequest request,HttpServletResponse response,Customer customer){
		map.put("list",customerService.selectAddress(customer));
		List<Customer> list = customerService.selectAddress(customer);
		return"index.do";
	} 


	@RequestMapping("/insert")
	public String inset(HttpServletRequest request,HttpServletResponse response){
		String fn = request.getParameter("FirstName");
		String ln = request.getParameter("LastName");
		String e = request.getParameter("Email");
		String a = request.getParameter("Address");
		Customer customer = new Customer();

		customer.setFirstName(fn);
		customer.setLastName(ln);
		customer.setEmail(e);
		customer.setAddress(a);

		customer.setAddress(a);

		int aid = customerService.selectAid(customer);
		customer.setAddressId(aid);

		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String cd=format.format(new Date());
		customer.setCreateDate(cd);
		int si = 1;
		customer.setStoreId(si);
		int ac = 1;
		customer.setActive(ac);
		customerService.insert(customer);
		return"success";
	}

	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,HttpServletResponse response){
		String ci2 = request.getParameter("customerid");
		int ci = Integer.parseInt(ci2);
		Customer c = new Customer();
		c.setCustomerId(ci);
		customerService.delete(c);
		return "success";
	}
	@RequestMapping("/update")
	public String update(HttpServletRequest request,HttpServletResponse response,Customer custmoer){
		String c = request.getParameter("customerid");
		int ci = Integer.parseInt(c);
		String f = request.getParameter("FirstName");
		String l = request.getParameter("LastName");
		custmoer.setCustomerId(ci);
		custmoer.setFirstName(f);
		custmoer.setLastName(l);
		customerService.update(custmoer);
		return"success";
		
	}
}
