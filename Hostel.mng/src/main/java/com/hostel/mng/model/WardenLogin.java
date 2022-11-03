package com.hostel.mng.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="wardenlogin")
public class WardenLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
  private String username;
  private String password;
public WardenLogin(int id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
public WardenLogin() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
  
}
