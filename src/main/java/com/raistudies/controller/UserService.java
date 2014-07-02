package com.raistudies.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.raistudies.domain.User;
import com.raistudies.persistence.UserMapper;


@Service
@Transactional
public class UserService {
	@Autowired
	private UserMapper userMapper; //This is to demonstrate injecting SqlSession object

	
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userMapper.getAllUser();
	}

}
