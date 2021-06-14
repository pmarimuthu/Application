package com.avs.portal.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avs.portal.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, UUID> {

	UserAccount findByIdAndPassword(UUID id, String password);

}
