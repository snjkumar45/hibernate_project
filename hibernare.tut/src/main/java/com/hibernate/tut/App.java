package com.hibernate.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("project started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Student student = new Student();
        student.setId(101);
        student.setsName("sanjay");
        student.setCourse("JAva");

        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(student);
        tx.commit();
        session.close();
        System.out.println(factory);
    }
}
