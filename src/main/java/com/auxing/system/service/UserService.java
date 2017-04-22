package com.auxing.system.service;



import java.util.List;

import com.auxing.system.entity.account.User;

public interface UserService {
	User findUserByLoginName(User user);
	
	List<User> findAll();
}
