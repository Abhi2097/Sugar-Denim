package com.niit.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.User;
//tells the Spring Container to create a bean of type ProductDao
//name of the bean - productDaoImpl
@Repository
@Transactional
public class UserDaoImpl implements UserDao {
@Autowired
private SessionFactory sessionFactory;	

    /**
     * Insert product details into a product table using hibernate framework
     * 1. Get session object from sessionfactory bean
     * 2. using method, insert the data
     */
	public User saveUser(User user) {//id=0,productname="pen",productdesc="pen",price=100,quantity=10
        	Session session=sessionFactory.getCurrentSession();//get session object from SessionFactory
        	System.out.println("Id of the user before persisting " + user.getId());
        	user.setRole("ROLE_USER");
        	user.setEnable(true);
        	session.save(user); //generate an insert query, insert the data into product table
        	System.out.println("Id of the user after persisting " + user.getId());
        	return user;//id will have some value 
	}

	public User getUser(int id) {
		Session session=sessionFactory.getCurrentSession();
		User user=(User)session.get(User.class, id);
		//session.get(Product.class,id) -> select * from product where id=?
		return user;
	}

}

