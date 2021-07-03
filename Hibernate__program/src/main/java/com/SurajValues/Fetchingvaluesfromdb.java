package com.SurajValues;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetchingvaluesfromdb {
	public static void main(String[] args) {
		
	
    //get load
	
	Configuration cnf=new Configuration();
	cnf.configure("hibernet.cfg.xml");
	SessionFactory sf=cnf.buildSessionFactory();
	Session ss=sf.openSession();
	Student1 st1=ss.load(Student1.class, 3);
	//System.out.println(st1);

	//Student1 st2=ss.get(Student1.class, 3);
//	System.out.println(st2);
	sf.close();
}
}
