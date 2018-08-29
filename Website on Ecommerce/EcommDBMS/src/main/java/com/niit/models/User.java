package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id  // - property id unique and not null
	@GeneratedValue(strategy=GenerationType.AUTO) //auto generation - automatically generate the value for id
private int id;
private String Username;
private String Email;
private int PhoneNumber;
private String password;
private String Role;
private boolean Enable;
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
public boolean getEnable() {
	return Enable;
}
public void setEnable(boolean enable) {
	Enable = enable;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public int getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	PhoneNumber = phoneNumber;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}