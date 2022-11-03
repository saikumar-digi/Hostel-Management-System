package com.hostel.mng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hostel.mng.model.Login;
import com.hostel.mng.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository repo;
	public Login login (String username,String password) {
	Login  login =repo.findByUsernameAndPassword(username,password);
			return login;

}
}
