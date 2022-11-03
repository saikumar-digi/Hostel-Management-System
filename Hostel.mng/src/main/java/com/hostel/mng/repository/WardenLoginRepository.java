package com.hostel.mng.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hostel.mng.model.Login;
import com.hostel.mng.model.WardenLogin;

@Repository
public interface WardenLoginRepository extends JpaRepository<WardenLogin, Integer>{
	WardenLogin findByUsernameAndPassword(String username,String password);
}

