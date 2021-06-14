package com.avs.portal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avs.portal.bean.LoginBean;
import com.avs.portal.exception.ApplicationException;
import com.avs.portal.service.LoginService;

@RestController
@RequestMapping(path = "/api/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
		
	@PostMapping(path = "/auth")
	public LoginBean userLogin(@RequestBody LoginBean bean) throws ApplicationException {
		LoginBean loginResult = loginService.authenticate(bean);
		System.out.println(loginResult);
		return loginResult;
	}

}
