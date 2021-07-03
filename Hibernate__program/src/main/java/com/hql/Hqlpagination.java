package com.hql;

import org.hibernate.query.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hqlpagination {
	public static void main(String[] args) {
		 Configuration cnf= new Configuration();
		 cnf.configure("hibernet.cfg.xml");
			 SessionFactory sf=cnf.buildSessionFactory();
			
			Session s= sf.openSession();
  
			
			Query q=s.createQuery("from been5");
			
			
			q.setFirstResult(5);
			q.setMaxResults(9);
			
		List<been5> l1=	q.list();
		for(been5 l3:l1) {
				System.out.println(l3.getCity()+" :   "+l3.getId()+"   :  "+l3.getName()+"  :   " );
		}
			s.close();
			 sf.close();
			 
	}

}
