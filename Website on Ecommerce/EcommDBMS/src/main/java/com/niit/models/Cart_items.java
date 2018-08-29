package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart_items{
	@Id  // - property id unique and not null
	@GeneratedValue(strategy=GenerationType.AUTO) //auto generation - automatically generate the value for id
private int id;
private int Order_ID;
private int Product_ID;
private int Quantity;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getOrder_ID() {
	return Order_ID;
}
public void setOrder_ID(int order_ID) {
	Order_ID = order_ID;
}
public int getProduct_ID() {
	return Product_ID;
}
public void setProduct_ID(int product_ID) {
	Product_ID = product_ID;
}
public int getQuantity() {
	return Quantity;
}
public void setQuantity(int quantity) {
	Quantity = quantity;
}
}