package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapdemo {
	public static void main(String[] args) {
	 Configuration cnf= new Configuration();
	 cnf.configure("hibernet.cfg.xml");
	 SessionFactory sf=cnf.buildSessionFactory();
	 
	  
	 Question1 q=new Question1();
	 q.setQ1d(101);
	 q.setQu("what is java");
	 
	 Answer1 ans=new Answer1();
	 ans.setAnsid(11);
	 ans.setAnswer("java is progrmming language");
	 ans.setQ1(q);
	 
	 Answer1 ans1=new Answer1();
	 ans1.setAnsid(12);
	 ans1.setAnswer("java is patform");
	 ans1.setQ1(q);
	 Answer1 ans2=new Answer1();
	 ans2.setAnsid(13);
	 ans2.setAnswer("java is object oriented languAGE");
	 ans2.setQ1(q);
	 
	List<Answer1> l=new ArrayList();
	 l.add(ans);
	 l.add(ans1);
	 l.add(ans2);
	 q.setAnswers(l);
	 
//	  
//		 Question1 q1=new Question1();
//		 q1.setQ1d(102);
//		 q1.setQu("what is collection");
//		 Answer1 ans1=new Answer1();
//		 ans1.setAnsid(12);
//		 
//		  ans1.setQ1(q1);
//		 ans1.setAnswer("a group of indidual object as a single entity is called collection");
//		 q1.setAnswer(ans1);
	 
	 
		 Session ss=sf.openSession();
		 
		Transaction tr= ss.beginTransaction();

		  ss.save(q);
		  ss.save(ans);
		  ss.save(ans2);
		  ss.save(ans1);
	
		Question1 qq= (Question1)ss.get(Question1.class, 101);
		System.out.println(qq.getQu());
		System.out.println(qq.getQ1d());
		//System.out.println(qq.getAnswers().size());
		//for(Answer1 a:qq.getAnswers()) {System.out.println(a.getAnswer());}
		 tr.commit();
//		 //fetch data
//		Question1 qnew=ss.get(Question1.class,101 );
//	     System.out.println(qnew.getQu());
//		System.out.println(qnew.getAnswer().getAnswer());
		 ss.close();
	     sf.close();
	}

}
