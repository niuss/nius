package com.auxing.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/*")
public class IndexController {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	String index(Model model){
		System.out.println("第一次修改");
		return "index";
	}
}
