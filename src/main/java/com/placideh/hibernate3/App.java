package com.placideh.hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Alien telusko=new Alien();
        	telusko.setAid(101);
        	AlienName aname=new AlienName();
        	aname.setFname("Hakizimana");
        	aname.setLname("Placide");
        	aname.setMname("uwizeye");
        	telusko.setAname(aname);
        	telusko.setColor("black");
        Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        	session.save(telusko);
        tx.commit();
    }
}
