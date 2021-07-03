package com.SurajValues;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

   @Entity //for claqdd ass represent as entiti
   @Table(name="student_address")
	public class Address1 {
	 @Id  //primaru key for
	 @GeneratedValue(strategy=GenerationType.IDENTITY)//autoincrement
	 @Column(name="address_id")
	 private int addressId;
	@Column(length = 50,name="STREET")
	 private String street;
	@Column(length = 50,name="CITY")
	private String city;
	@Column(name="IS_OPEN")
	private boolean isopen;

//is for no create table of thhis field
	private double x;
	@Column(name = "addedDate")
	@Temporal(TemporalType.DATE) //formet me laaneke liye
	private Date addDate;
	@Lob ///image large laane ke liye
	private byte[] image;


public Address1() {
	super();
	
}


public Address1(int addressId, String street, String city, boolean isopen, double x, Date addeDate, byte[] image) {
	super();
	this.addressId = addressId;
	this.street = street;
	this.city = city;
	this.isopen = isopen;
	this.x = x;
	this.addDate = addeDate;
	this.image = image;
}


public int getAsddressId() {
	return addressId;
}


public void setAsddressId(int asddressId) {
	this.addressId = asddressId;
}


public String getStreet() {
	return street;
}


public void setStreet(String street) {
	this.street = street;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public boolean isIsopen() {
	return isopen;
}


public void setIsopen(boolean isopen) {
	this.isopen = isopen;
}


public double getX() {
	return x;
}


public void setX(double x) {
	this.x = x;
}


public Date getAddeDate() {
	return addDate;
}


public void setAddeDate(Date addeDate) {
	this.addDate = addeDate;
}


public byte[] getImage() {
	return image;
}


public void setImage(byte[] image) {
	this.image = image;
}
	
 


}
