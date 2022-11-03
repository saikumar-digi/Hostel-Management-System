package com.hostel.mng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.hostel.mng.model.WardenLogin;

import com.hostel.mng.repository.WardenLoginRepository;

@Service
public class WardenLoginService {

	@Autowired
	private WardenLoginRepository repo;
	public WardenLogin login (String username,String password) {
	WardenLogin  login =repo.findByUsernameAndPassword(username,password);
			return login;

}
}
