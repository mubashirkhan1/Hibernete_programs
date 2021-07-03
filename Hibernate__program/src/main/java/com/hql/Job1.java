package com.hql;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Job1 {
	@Id
	private int jobid;
	private String typejob;
    @OneToMany
	private List <been5> users;
    
	public List<been5> getUsers() {
		return users;
	}

	public void setUsers(List<been5> users) {
		this.users = users;
	}

	public int getJobid() {
		return jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getTypejob() {
		return typejob;
	}

	public void setTypejob(String typejob) {
		this.typejob = typejob;
	}

	public Job1() {
		super();
		// TODO Auto-generated constructor stub
	}

}


















