package com.hql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.Question1;

public class Mappinguser {
	
	public static void main(String[] args) {
		 Configuration cnf= new Configuration();
	 cnf.configure("hibernet.cfg.xml");
		 SessionFactory sf=cnf.buildSessionFactory();
		 
		  
       been5 b=new been5();
		 b.setId(77);
		 b.setName("mbashir");
		 b.setCity("kolkatta");
 
	 been5 b1=new been5();
		 b1.setId(30);
		 b1.setName("adnan");
		 b1.setCity("kalwa");
		 
		 been5 b2=new been5();	
		 
		 b2.setId(84);
		 b2.setName("imraan");
		 b2.setCity("vasi nager");
		 
		 
		 been5 b3=new been5();
		 b3.setId(29);
		 b3.setName("sehbaaz");
		 b3.setCity("vijay nagar");
		 
		 
		 been5 b4=new been5();
		 b4.setId(43);
		 b4.setName("affan");
		 b4.setCity("mumbra");
		 
		 List <been5> l=new ArrayList();
		 l.add(b4);
		 l.add(b3);
		 l.add(b2);
		 l.add(b);
		 Job1 j=new Job1();
		 j.setTypejob("web dveoper");
		 j.setJobid(4);
		 j.setUsers(l);
		 

		 Session ss=sf.openSession();
		 
		Transaction tr= ss.beginTransaction();
		ss.save(b);
		ss.save(b1);
		ss.save(b2);
		ss.save(b3);
		ss.save(b4);
		ss.save(j);
		tr.commit();
		}
}
