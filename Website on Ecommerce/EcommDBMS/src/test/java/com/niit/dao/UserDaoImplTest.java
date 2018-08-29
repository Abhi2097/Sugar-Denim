package com.niit.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.models.User;

import junit.framework.TestCase;
public class UserDaoImplTest extends TestCase {
	 ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,UserDaoImpl.class);
	   UserDao userDao=(UserDao)context.getBean("userDaoImpl");
	   
	public void testSaveUser() {
		
	}

	public void testGetUser() {
	   User user=userDao.getUser(1);
	  // Product product1=productDao.getProduct(3);//id=3,
	  // Product product2=productDao.getProduct(4);//id==4
	   //Null or Not null
	   assertNull(user);
	   //assertNotNull(product3);
	   
	   
	   //check for prices [actual price returned is same as expected price for id=3
	  // double expectedPrice=1000;
	  // double actualPrice=user3.getPrice();
	   //assertTrue(expectedPrice==actualPrice);
	}

}


