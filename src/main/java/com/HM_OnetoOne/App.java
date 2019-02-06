package com.HM_OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
       
       cfg.addAnnotatedClass(Person.class);
       cfg.addAnnotatedClass(PersonDetails.class);
        cfg.configure();
       
        
        SessionFactory sf=cfg.buildSessionFactory();
        Session session=sf.openSession();
        
        PersonDetails pd=new PersonDetails();
        pd.setJob("Engineer");
        Person p=new Person();
        p.setPersonName("Nilesh");
        p.setPersonDetails(pd);
        
        session.beginTransaction();
        session.save(p);
        session.getTransaction().commit();
     
    }
}
