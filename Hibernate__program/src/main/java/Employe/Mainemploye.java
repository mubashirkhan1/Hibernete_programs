package Employe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Mainemploye {
	public static void main(String[] args) throws IOException {
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernet.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
	

		Employe1 e = new Employe1();
		e.setId(101);
		e.setName("mubashirkhan");
		e.setCity("mumbai");
//
//		FileInputStream fis = new FileInputStream("src/main/java/Employe/images.jpg");
//
//		byte[] b = new byte[fis.available()];
//		 fis.read(b);
	 Employeorder ed=new Employeorder();
	 ed.setOrderdate(new Date());
	 ed.setOrderid(101);
	 ed.setOrdermaterial("clothes");
	// e.setMaterial(ed);
	   ed.setEmplye(e);
	   Employeorder ed1=new Employeorder();
	   ed.setOrderdate(new Date());
		 ed1.setOrderid(102);
		 ed1.setOrdermaterial("shoes");
		// e.setMaterial(ed);
		 ed1.setEmplye(e);
		 List<Employeorder> list=new ArrayList<Employeorder>();
         list.add(ed);
         list.add(ed1);
         e.setMaterial(list);
		 Session ss = sf.openSession();

		Transaction tr = ss.beginTransaction();
//		
		ss.save(e);
		ss.save(ed);
		ss.save(ed1);
		tr.commit();
		 
//		Employe1   p=   ss.get(Employe1.class, 4);
//	     System.out.println(p.getCity()+p.getName());
		ss.close();
		sf.close();
	}

}
