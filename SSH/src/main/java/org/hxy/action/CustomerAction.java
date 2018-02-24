package org.hxy.action;

import org.hxy.entity.Customer;
import org.hxy.service.CustomerService;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	
	private Long custId;
	
	private Customer customer;
	
	private CustomerService customerService;
	

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}
	
	public String findCustomerById() {
		customer = customerService.findById(custId);
		System.out.println("前端传过来的客户id是：" + custId);
		return SUCCESS;
	}
	
}
