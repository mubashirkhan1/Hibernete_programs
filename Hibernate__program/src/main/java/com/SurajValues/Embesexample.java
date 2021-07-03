package com.SurajValues;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embesexample {
	
	public static void main(String[] args) {
	    System.out.println("project stated"); 
	      Configuration cng=new Configuration();
	      cng.configure("hibernet.cfg.xml");
	      SessionFactory sf=cng.buildSessionFactory();
	      Student1 st=new Student1();
	      st.setId(123);
	      st.setName("zafer ahmed");
	      st.setCity("gaoo");
	      Certificate stf=new Certificate();
	      stf.setCourse("java");
	      stf.setDuration("3 year");
	      st.setCerti(stf);
	      
	      Student1 st1=new Student1();
	      st1.setId(444);
	      st1.setName("zafer ahmed 444");
	      st1.setCity("mumbai11");
	      Certificate stf1=new Certificate();
	      stf1.setCourse("python");
	      stf1.setDuration("33 year");
	      st.setCerti(stf1);
	      
	      
	      Session ss=sf.openSession();
	      Transaction tx=ss.beginTransaction();
	       ss.save(stf);
	       ss.save(stf1);//object  save
	       tx.commit();
	      ss.close();
	      sf.close();
	}

}
