package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlQueries {
	public static void main(String[] args) {

		Configuration cnf = new Configuration();
		cnf.configure("hibernet.cfg.xml");
		SessionFactory sf = cnf.buildSessionFactory();

		Session s = sf.openSession();
	//this sql quer
		String q="select * from user1";
	NativeQuery  nq=	s.createSQLQuery(q);
	
	    List<Object[]>  l=nq.list();
	    for(Object[]  user:l) {System.out.println(Arrays.toString(user));}
		
		
		s.close();
		sf.close();
	}
}