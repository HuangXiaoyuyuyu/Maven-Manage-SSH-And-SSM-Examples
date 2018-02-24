package org.hxy.dao.impl;

import static org.junit.Assert.*;

import org.hxy.dao.CustomerDao;
import org.hxy.entity.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerDaoImplTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		CustomerDao customerDao = (CustomerDao) app.getBean("customerDao");
		Customer customer = customerDao.findById(23L);
		System.out.println(customer);
	}

}
