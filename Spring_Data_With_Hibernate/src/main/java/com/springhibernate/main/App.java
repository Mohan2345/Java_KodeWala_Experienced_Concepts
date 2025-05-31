package com.springhibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.springhibernate.main.entity.Payment;

public class App {
    public static void main(String[] args) {
        Payment pm = new Payment("Pending");
        // Factory creation + load the configuration + configure the hibernate.cfg.xml file
        
        /* 
         * if you keep the hibernate.cfg.xml file in another package then give the complete
         * Path of the file with package as given below
         */
         
        /* 
         * if you keep the hibernate.cfg.xml file in same where App.java is present then 
         * just give the file name as it is like hibernate.cfg.xml
         */
        
        SessionFactory factory = new Configuration().configure("/com/springhibernate/main/config/hibernate.cfg.xml").buildSessionFactory();
        // create the session
        Session session = factory.openSession();
        // begin the transaction
        Transaction txn = session.beginTransaction();
        // perform the operation
        session.persist(pm);
        // commit the transaction
        txn.commit();
        // close the session
        session.close();
        // close the factory
        factory.close();
    }
}
