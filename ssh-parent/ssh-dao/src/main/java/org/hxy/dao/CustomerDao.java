package org.hxy.dao;

import org.hxy.entity.Customer;

public interface CustomerDao {
	
	public Customer findById(Long id);
	
}
