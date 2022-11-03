package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.mng.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
	Login findByUsernameAndPassword(String username,String password);

}
