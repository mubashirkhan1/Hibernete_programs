package Manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Mapping {
	public static void main(String[] args) {
	Configuration cfg = new Configuration();
		
		cfg.configure("hibernet.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Worker w1=new Worker();
		Worker w2=new Worker();
		
		w1.setEid(55);
		w1.setEname("mubashir");
		w2.setEid(66);
		w2.setEname("mudassir");
		
		Project p1=new Project();

		Project p2=new Project();
		p1.setPid(11);
		p1.setName("libraruuy manngement system");
		p2.setPid(12);
		p2.setName("hospital managements");
		
		List<Worker> l1=new ArrayList<Worker>();
		List<Project> l2=new ArrayList<Project>();
		
		l1.add(w1);
		l1.add(w2);
		
		l2.add(p1);
		l2.add(p2);
		w1.setProjects(l2);
		p2.setWorkers(l1);
		
		Session ss=sf.openSession();
		
		Transaction ts=ss.beginTransaction();
		
		ss.save(w1);
		ss.save(w2);
		ss.save(p1);
		ss.save(p2);
        ts.commit();
	}

}
