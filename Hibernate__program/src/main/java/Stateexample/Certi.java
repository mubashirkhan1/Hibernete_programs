package Stateexample;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Embeddable
public class Certi {
	private String cname;
	private String duration;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certi(String cname, String duration) {
		super();
		this.cname = cname;
		this.duration = duration;
	}
	

}
