package com.auxing.system.service.impl;


import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.auxing.system.dao.UserDao;
import com.auxing.system.entity.account.User;
import com.auxing.system.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	UserDao userDao;
	
	@Override
	public User findUserByLoginName(User user) {
		return this.userDao.findUserByLoginName(user);
	}

	@Override
	public List<User> findAll() {
		return userDao.finAll();
	}

	
}
