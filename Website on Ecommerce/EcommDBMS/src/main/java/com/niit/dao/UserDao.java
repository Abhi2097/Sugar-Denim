package com.niit.dao;

import com.niit.models.User;

public interface UserDao {
	User saveUser(User user);
	User getUser(int id);
	}

