package com.avs.portal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avs.portal.entity.User;
import com.avs.portal.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, User> {

}
