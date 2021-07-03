package com.hql;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hqlexample1 {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("hibernet.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session ss = sf.openSession();
		// syntax
		//
		String query = "from been5 as s where s.city=:f  and s.name=:m";
		// been5 b=new been5();
//fetching value
		org.hibernate.Query<been5> q = ss.createQuery(query);// Return query object
		q.setParameter("f", "mumbra");
		q.setParameter("m", "affan");
		Iterator<been5> p1 = q.iterate();
		while (p1.hasNext()) {
			been5 b2 = p1.next();
			System.out.println(b2.getCity() + "  " + b2.getId() + "  " + b2.getName());
		}

		System.out.println("-----------------------------------------------------------------------");
		// delete value from database
		Transaction tr = ss.beginTransaction();
//		org.hibernate.Query<been5> q3 = ss.createQuery("delete from been5 ss where ss.city=:c");
//		q3.setParameter("c", "kolkatta");
//		int r = q3.executeUpdate();
//		System.out.println("value delete from table");
//		System.out.println(r);
//
//		org.hibernate.Query<been5> bb = ss.createQuery("update been5 set city=:v where id=:m");
//		bb.setParameter("v", "himaliya");
//		bb.setParameter("m", 35);
//		int cc = bb.executeUpdate();
//
//		System.out.println("update table ");
//		System.out.println(cc);

		// join query
		tr.commit();
	org.hibernate.Query q4=	ss.createQuery("select j.typejob,j.jobid,b.name from Job1 as j inner join b.user as b ");
	 List <Object []>  rl= q4.getResultList()	;
	 for(Object[] arr:rl) {
		 
		 System.out.println(Arrays.toString(arr));
	 }
	
	
	
		ss.close();
		sf.close();

	}

}
