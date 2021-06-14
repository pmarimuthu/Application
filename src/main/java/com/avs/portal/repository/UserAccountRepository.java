package com.avs.portal.repository;

<<<<<<< HEAD
import org.springframework.data.jpa.repository.JpaRepository;

import com.avs.portal.entity.User;
import com.avs.portal.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, User> {
=======
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avs.portal.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, UUID> {

	UserAccount findByIdAndPassword(UUID id, String password);
>>>>>>> b030e04... initial commit

}
