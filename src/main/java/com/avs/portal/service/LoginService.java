package com.avs.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avs.portal.bean.LoginBean;
import com.avs.portal.bean.UserAccountBean;
import com.avs.portal.entity.User;
import com.avs.portal.entity.UserAccount;
import com.avs.portal.exception.ApplicationException;
import com.avs.portal.repository.UserAccountRepository;
import com.avs.portal.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserAccountRepository accountRepository;

	public LoginBean authenticate(LoginBean loginBean) throws ApplicationException {

		if (loginBean == null) {
			return loginBean;
		}

		String code = "XXXX"; // PALV

		List<User> users = userRepository.findByEmailOrPhone(loginBean.getEmail(), loginBean.getPhone());
		User user = users.stream().findFirst().orElse(null);
		if(user != null) {
			UserAccount account = accountRepository.findByIdAndPassword(user.getId(), loginBean.getPassword());
			if(account != null)
				code = getCode(account.toBean());				
			else
				code = "1XXX";
			
			loginBean.setId(user.getId());
			loginBean.setEmail(user.getEmail());
			loginBean.setPhone(user.getPhone());
		}

		loginBean.setResultCode(code);

		return loginBean;
	}

	private String getCode(UserAccountBean accountBean) {

		return String.format("%s%s%s%s;", "0", // Password
				accountBean.getIsActive() ? "0" : "1", // Active
						accountBean.getIsLocked() ? "0" : "1", // Locked
								accountBean.getIsVerified() ? "0" : "1" // Verified
				);
	}

}
