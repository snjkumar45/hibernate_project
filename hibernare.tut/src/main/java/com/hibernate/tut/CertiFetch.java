package com.hibernate.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CertiFetch {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory factory = cfg.buildSessionFactory();
       
       Student s1=new Student();
       s1.setId(11);
       s1.setsName("milan");
       s1.setCourse("python");
       Certificate c1=new Certificate();
       c1.setCertiLanguage("Android");
       c1.setDuration(6);
       s1.setCertificate(c1);
       
       Student s2=new Student();
       s2.setId(12);
       s2.setsName("munwar");
       s2.setCourse("django");
       Certificate c2=new Certificate();
       c2.setCertiLanguage("black");
       c2.setDuration(6);
       s2.setCertificate(c1);
       Session ses = factory.openSession();
       Transaction tx = ses.beginTransaction();
       ses.save(s1);
       ses.save(s2);
       tx.commit();
       factory.close();
       


       factory.close();
    
}
}
