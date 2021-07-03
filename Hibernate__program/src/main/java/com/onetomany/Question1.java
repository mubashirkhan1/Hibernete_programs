package com.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Question1 {
	@Id
	@Column(name ="question_id")
	private int q1d;
	
	@Column(name ="question")
	private String qu;
	
   @OneToMany(mappedBy = "q1",fetch =FetchType.EAGER , cascade = CascadeType.ALL)
	private List<Answer1> answers;
	public int getQ1d() {
		return q1d;
	}
	public void setQ1d(int q1d) {
		this.q1d = q1d;
	}
	public String getQu() {
		return qu;
	}
	public void setQu(String qu) {
		this.qu = qu;
	}

	public Question1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question1(int q1d, String qu, List<Answer1> answers) {
		super();
		this.q1d = q1d;
		this.qu = qu;
		this.answers = answers;
	}
	public List<Answer1> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer1> answers) {
		this.answers = answers;
	}
	

}
