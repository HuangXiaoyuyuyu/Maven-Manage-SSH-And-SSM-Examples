package org.hxy.service.impl;

import org.hxy.dao.CustomerDao;
import org.hxy.entity.Customer;
import org.hxy.service.CustomerService;
 
public class CustomerServiceImpl implements CustomerService{

	private CustomerDao customerDao;
	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	 
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findById(Long id) {
		// TODO Auto-generated method stub
		return customerDao.findById(id);
	}
}
