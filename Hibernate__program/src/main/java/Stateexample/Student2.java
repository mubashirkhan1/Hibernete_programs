package Stateexample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student2 {
@Id
	private int id;
private String name;
private String  city;
private Certi certificate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Certi getCertificate() {
	return certificate;
}
public void setCertificate(Certi certificate) {
	this.certificate = certificate;
}
public Student2() {
	super();
	// TODO Auto-generated constructor stub
}


}
