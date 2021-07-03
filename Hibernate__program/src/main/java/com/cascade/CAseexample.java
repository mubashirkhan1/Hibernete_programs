package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.Answer1;
import com.onetomany.Question1;

public class CAseexample {
	public static void main(String[] args) {
		 Configuration cnf= new Configuration();
		 cnf.configure("hibernet.cfg.xml");
			 SessionFactory sf=cnf.buildSessionFactory();
			
			Session s= sf.openSession();
	        Question1 q=new Question1();
	         q.setQ1d(5);
	         q.setQu("what is mubashir ");
	        
	          Answer1 a=new Answer1(22,"mubashir is name");
	          
	          Answer1 a1=new Answer1(33,"mubashir is smart");
	          
	          Answer1 a2=new Answer1(55,"mubasnir is cool");
	          
	          Answer1 a3=new Answer1(65,"mubasjhir is frm india");
	          
	          
	          List l=new ArrayList();
	          l.add(a);
	          l.add(a1);
	          l.add(a2);
	          l.add(a3);
	          
	          q.setAnswers(l);
	          
	    Transaction tr=      s.beginTransaction();
	    
	    s.save(q);
	    tr.commit();
			    s.close();
			    sf.close();
			
	}}

