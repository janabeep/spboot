package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.users;
import com.example.demo.userdao.userDAO;
@SpringBootApplication
@Controller
public class usercontroller {
	
	@RequestMapping(value="index",method=RequestMethod.GET )
	public String index() {
		return "index";
	}
	
	@Autowired
	userDAO userdao;
	
	@RequestMapping(value="index",method=RequestMethod.POST)
	public String add(users ud) {
		userdao.save(ud);
		return "adduser";
		
	}
	
}
