package Stateexample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StateDemo {
	public static void main(String[] args) {
		System.out.println("hello i love india");
		Configuration cf=new Configuration();
		cf.configure("hibernet.cfg.xml");
		SessionFactory sf=cf.buildSessionFactory();
	   // creatig students object
		Student2 s=new Student2();
		s.setId(5);
		s.setName("arif");
		s.setCity("mumbai");//your object on transient state 
		
		
		s.setCertificate(new Certi("java course","2 month"));
		
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		ss.save(s);
		s.setName("affan");
		tr.commit();
		//aassociated with  databaases   persistense state
		ss.close();
		s.setName("sachin");
		sf.close();
		
	}

}
