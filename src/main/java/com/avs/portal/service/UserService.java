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
import com.avs.portal.exception.ApplicationException;
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

	public List<UserBean> create(UserBean bean) throws ApplicationException {
		if(bean == null)
			return Collections.emptyList();
		
		java.util.Date now = new java.util.Date();
		
		User user = new User();
		user.setEmail(bean.getEmail());
		user.setPhone(bean.getPhone());
		user.setRole(bean.getRole());
		
		user.setCreatedOn(new java.sql.Timestamp(now.getTime()));
		user.setUpdatedOn(new java.sql.Date(now.getTime()));
		
		if(bean.getReferredBy() != null) {
			User referredBy = userRepository.findById(bean.getReferredBy().getId()).orElse(null);
			if(referredBy == null || referredBy.getCreatedOn().before(user.getCreatedOn()))
				throw new ApplicationException("ReferredBy Tampered.");
			
			user.setReferredBy(referredBy);
		}
		
		user = userRepository.save(user);
		userAccountRepository.save(new UserAccount(user.getId(), user.getId().toString()));
		
		return listUsers();
	}
	

	public List<UserBean> update(UserBean bean) throws ApplicationException {
		if(bean == null || bean.getId() == null)
			return Collections.emptyList();
		
		User user = userRepository.getById(bean.getId());
		user.setEmail(bean.getEmail());
		user.setPhone(bean.getPhone());
		user.setRole(bean.getRole());
		user.setLastLoginOn(bean.getLastLoginOn());
		user.setUpdatedOn(new Date(new java.util.Date().getTime()));
		
		if(bean.getReferredBy() != null) {
			User referredBy = userRepository.findById(bean.getReferredBy().getId()).orElse(null);
			if(referredBy == null || referredBy.getCreatedOn().before(user.getCreatedOn()))
				throw new ApplicationException("ReferredBy Tampered.");
			
			user.setReferredBy(referredBy);
		}
		
		user = userRepository.save(user);		
		
		return listUsers();
	}

	public List<UserBean> delete(UserBean bean) {
		if(bean == null || bean.getId() == null)
			return Collections.emptyList();
		
		User user = userRepository.findById(bean.getId()).orElse(null);
		if(user != null)
			userRepository.delete(user);
		
		return listUsers();
	}
	
}
