package com.cg.jhd.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "door_number",length = 10)
   private String doornumber;
	@Column(name = "city",length = 10)
	private String city;
	@Column(name = "state",length = 10)
   private String state;
   
   public Address()
   {
	   
   }
   
public Address(String doornumber, String city, String state) {
	super();
	this.doornumber = doornumber;
	this.city = city;
	this.state = state;
}
public String getDoornumber() {
	return doornumber;
}
public void setDoornumber(String doornumber) {
	this.doornumber = doornumber;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return String.format("Address [doornumber=%s, city=%s, state=%s]", doornumber, city, state);
}
   
   
}
