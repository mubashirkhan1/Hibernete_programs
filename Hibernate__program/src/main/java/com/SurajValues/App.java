package com.SurajValues;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.SurajValues.*;


public class App 
{ 
    public static void main( String[] args ) throws IOException
    {
      System.out.println("project stated"); 
      Configuration cng=new Configuration();
      cng.configure("hibernet.cfg.xml");
      SessionFactory sf=cng.buildSessionFactory();
//      System.out.println(sf);
//      System.out.println(sf.isClosed());
      Student1 st=new Student1();
     st.setId(4);
     st.setName("affan");
     st.setCity("pune");
    // System.out.println(st);
     //creating object of address class
     Address1  ad=new Address1();
     ad.setStreet("Street12");
     ad.setCity("kolkatta");
     ad.setIsopen(true);
     ad.setAddeDate(new Date());
     ad.setX(1.22);
     //image reading 
     FileInputStream f=new FileInputStream("src/main/java/images.jpg");
     byte[] data=new byte[f.available()];
     f.read(data);
     ad.setImage(data);
     Session ss=sf.openSession();
	    
	   Transaction tr=ss.beginTransaction();
	   ss.save(st);
	   ss.save(ad);
	   tr.commit();
	   ss.close();
	   System.out.println("done");
    }
}
