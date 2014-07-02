package com.raistudies.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.raistudies.domain.User;

@Controller
public class UserController {
	
	@Autowired
	UserService springService;
	
	@RequestMapping("/a.json")
	@ResponseBody
	public List<User> init(){
		return springService.getUser();
	}
}
