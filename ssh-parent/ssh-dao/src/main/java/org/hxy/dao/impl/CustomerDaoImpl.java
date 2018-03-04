package org.hxy.dao.impl;

import org.hxy.dao.CustomerDao;
import org.hxy.entity.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	 
	@Override
	public Customer findById(Long id) {
		
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Customer.class, id);
	}

}
