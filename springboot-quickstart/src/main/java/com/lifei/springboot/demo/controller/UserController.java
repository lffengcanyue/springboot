package com.lifei.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifei.springboot.demo.dao.mapper.UserMapper;
import com.lifei.springboot.demo.dao.model.User;

@RestController
public class UserController {

	@Autowired
	private UserMapper userMapper;
	@RequestMapping(method=RequestMethod.GET,value="/user/getAllUsers")
	public List<User> getAllUsers()
	{
		return userMapper.selectAll();
	}
}
