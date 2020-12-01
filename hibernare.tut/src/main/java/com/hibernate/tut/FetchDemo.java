package com.hibernate.tut;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        org.hibernate.SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        // get student id
        Student student = session.get(Student.class, 101);
        System.out.println(student);
        Student load = session.load(Student.class, 106);
        System.out.println(load);


        session.close();
        factory.close();

    }
}
