package com.firstlevelcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hql.been5;

public class Firstlevelchache {
  public static void main(String[] args) {
	  Configuration cnf= new Configuration();
		 cnf.configure("hibernet.cfg.xml");
			 SessionFactory sf=cnf.buildSessionFactory();
			  
			  Session s= sf.openSession();
			  
		been5 b5=	  s.get(been5.class, 5);
		
		System.out.println(b5.getCity()+"   "+b5.getName()+"  "+b5.getId());
		System.out.println("working somthing  ");
		  
		been5 b6=	  s.get(been5.class, 5);
		System.out.println(b6.getCity()+"   "+b6.getName()+"  "+b6.getId());
		System.out.println(s.contains(b6));

		
}
}
