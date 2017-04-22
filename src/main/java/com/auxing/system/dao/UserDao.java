package com.auxing.system.dao;


import java.util.List;

import com.auxing.system.entity.account.User;

public interface UserDao {

	User findUserByLoginName(User user);

	List<User> finAll();
}
