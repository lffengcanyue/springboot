package com.lifei.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lifei.springboot.demo.dao.mapper.UserInfoMapper;
import com.lifei.springboot.demo.dao.model.UserInfo;

@RestController
public class UserController {

	@Autowired
	private UserInfoMapper userInfoMapper;
	@RequestMapping(method=RequestMethod.GET,value="/user/getAllUsers")
	public List<UserInfo> getAllUsers()
	{
		return userInfoMapper.selectAll();
	}
}
