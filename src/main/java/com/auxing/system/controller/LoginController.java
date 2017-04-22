package com.auxing.system.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.auxing.system.entity.account.User;
import com.auxing.system.service.impl.UserServiceImpl;

@Controller
@RequestMapping("/*")
public class LoginController {
    @Resource
	private UserServiceImpl userService;
	
	@RequestMapping(value = {"","/","login"}, method = RequestMethod.GET)
	String login(Model model, String username, String password){
		System.out.println("login");
		return "login";
	}
	
	@RequestMapping(value = "/do-login", method = RequestMethod.POST)
	String doLogin(Model model, String username, String password){
		User user = new User();
/*		user.setUsername(username);
		user.setPassword(password);
		List<User> acct_Users = new ArrayList<User>();
		user = userService.findUserByLoginName(user);
		acct_Users = userService.findAll();*/
		return "login";
	}
}
