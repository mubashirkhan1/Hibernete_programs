package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer1 {
	@ManyToOne
	private Question1 q1;
	@Id
	@Column(name ="answer_id")
	private int ansid;
	@Column(name ="answer")
	private String answer;
	public int getAnsid() {
		return ansid;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Answer1(int ansid, String answer) {
		super();
		this.ansid = ansid;
		this.answer = answer;
	}
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question1 getQ1() {
		return q1;
	}
	public void setQ1(Question1 q1) {
		this.q1 = q1;
	}
	

  
}
