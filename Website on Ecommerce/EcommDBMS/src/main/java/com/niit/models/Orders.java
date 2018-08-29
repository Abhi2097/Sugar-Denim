package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Orders {
	@Id  // - property id unique and not null
	@GeneratedValue(strategy=GenerationType.AUTO) //auto generation - automatically generate the value for id
private int id;
private int cust_ID;
private String Shipment_Address;
private String payment_type;
private int Date;
private int Total;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCust_ID() {
	return cust_ID;
}
public void setCust_ID(int cust_ID) {
	this.cust_ID = cust_ID;
}
public String getShipment_Address() {
	return Shipment_Address;
}
public void setShipment_Address(String shipment_Address) {
	Shipment_Address = shipment_Address;
}
public String getPayment_type() {
	return payment_type;
}
public void setPayment_type(String payment_type) {
	this.payment_type = payment_type;
}
public int getDate() {
	return Date;
}
public void setDate(int date) {
	Date = date;
}
public int getTotal() {
	return Total;
}
public void setTotal(int total) {
	Total = total;
}
}