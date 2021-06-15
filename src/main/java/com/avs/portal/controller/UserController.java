package com.avs.portal.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avs.portal.bean.UserBean;
import com.avs.portal.exception.ApplicationException;
import com.avs.portal.service.UserService;

@RestController
@RequestMapping(path = "/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@PostMapping(path = "/list")
	public List<UserBean> listUser() {
		return userService.listUsers();
	}
	
	@PostMapping(path = "/add")
	public List<UserBean> addUser(@RequestBody UserBean bean) {
		try {
			return userService.create(bean);
		} catch (ApplicationException e) {
			System.err.println(e.getMessage());
		}
		
		return Collections.emptyList();
	}
	
	@PostMapping(path = "/edit")
	public List<UserBean> editUser(@RequestBody UserBean bean) {
		try {
			return userService.update(bean);
		} catch (ApplicationException e) {
			System.err.println(e.getMessage());
		}
		
		return Collections.emptyList();
	}

	@PostMapping(path = "/remove")
	public List<UserBean> removeUser(@RequestBody UserBean bean) {
		return userService.delete(bean);
	}

}
