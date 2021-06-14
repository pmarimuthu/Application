package com.avs.portal.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avs.portal.entity.User;

public interface UserRepository extends JpaRepository<User, UUID> {

	List<User> findAll();
<<<<<<< HEAD
=======
	
	List<User> findByEmailOrPhone(String email, Long phone);
>>>>>>> b030e04... initial commit
}
