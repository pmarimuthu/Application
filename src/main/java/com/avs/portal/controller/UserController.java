package com.avs.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avs.portal.bean.UserBean;
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
<<<<<<< HEAD
		System.err.println(bean.toString());
=======
>>>>>>> b030e04... initial commit
		return userService.create(bean);
	}
	
	@PostMapping(path = "/edit")
	public List<UserBean> editUser(@RequestBody UserBean bean) {
<<<<<<< HEAD
		System.err.println(bean.toString());
=======
>>>>>>> b030e04... initial commit
		return userService.update(bean);
	}

}
