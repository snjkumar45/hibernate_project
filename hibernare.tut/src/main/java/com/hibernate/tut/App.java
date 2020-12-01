package com.hibernate.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException{
        System.out.println("project started");
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Student student = new Student();
        student.setId(101);
        student.setsName("sanjay");
        student.setCourse("JAva");
        //creating address class object
        Address address=new Address();
        address.setStreet("hongkong");
        address.setOpen(true);
        address.setAddedDate(new Date());
       // address.setX(200.0d);
        //reading image
        try {
            FileInputStream fis=new FileInputStream("src/main/java/pic.jpeg");
            byte[] data=new byte[fis.available()];
            fis.read(data);
            address.setImage(data);
            fis.close();
            
        } catch (Exception e) {
             e.printStackTrace();
        }
       



        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        session.save(student);
        session.save(address);
        tx.commit();
        session.close();
        System.out.println("done");
       // System.out.println(factory);
    }
}
