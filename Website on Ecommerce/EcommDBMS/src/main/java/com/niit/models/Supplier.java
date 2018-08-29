package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Supplier{
	@Id  // - property id unique and not null
	@GeneratedValue(strategy=GenerationType.AUTO) //auto generation - automatically generate the value for id
private int id;
private String SuppName;
private String SuppAddr;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSuppName() {
	return SuppName;
}
public void setSuppName(String suppName) {
	SuppName = suppName;
}
public String getSuppAddr() {
	return SuppAddr;
}
public void setSuppAddr(String suppAddr) {
	SuppAddr = suppAddr;
}
}