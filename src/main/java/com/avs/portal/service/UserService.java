package com.avs.portal.service;

import java.sql.Date;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avs.portal.bean.UserBean;
import com.avs.portal.entity.User;
import com.avs.portal.entity.UserAccount;
import com.avs.portal.repository.UserAccountRepository;
import com.avs.portal.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserAccountRepository userAccountRepository;
	
	public List<UserBean> listUsers() {
		List<User> users = userRepository.findAll();
		return users.stream().map(User::toBean).collect(Collectors.toList());
	}

	public List<UserBean> create(UserBean bean) {
		if(bean == null)
			return Collections.emptyList();
					
		User user = new User();
		user.setEmail(bean.getEmail());
		user.setPhone(bean.getPhone());
		user.setRole(bean.getRole());
		user.setLastLoginOn(bean.getLastLoginOn());
		user.setUpdatedOn(new Date(new java.util.Date().getTime()));
		
		if(bean.getReferredBy() != null) {
			System.err.println("Given bean.getReferredBy() : " + bean.getReferredBy());
			User referredBy = userRepository.getById(bean.getReferredBy().getId());
			user.setReferredBy(referredBy);
			System.err.println("ReferredBy: " + referredBy.getEmail());
		}
		
		user = userRepository.save(user);
		
		UserAccount userAccount = userAccountRepository.save(new UserAccount(user.getId(), user.getId().toString()));
		System.err.println("Account: " + userAccount.getUser().toString());
		
		return listUsers();
	}
	

	public List<UserBean> update(UserBean bean) {
		if(bean == null || bean.getId() == null)
			return Collections.emptyList();
		
		User user = userRepository.getById(bean.getId());
		user.setEmail(bean.getEmail());
		user.setPhone(bean.getPhone());
		user.setRole(bean.getRole());
		user.setLastLoginOn(bean.getLastLoginOn());
		user.setUpdatedOn(new Date(new java.util.Date().getTime()));
		
		if(bean.getReferredBy() != null) {
			System.err.println("To Update bean.getReferredBy() : " + bean.getReferredBy());
			User referredBy = userRepository.getById(bean.getReferredBy().getId());
			user.setReferredBy(referredBy);
			System.err.println("Updated ReferredBy: " + referredBy.getEmail());
		}
		
		user = userRepository.save(user);		
		
		return listUsers();
	}
	
}