package com.store.entityutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration()
                    .configure() // loads hibernate.cfg.xml
                    .buildSessionFactory();
        } catch (Throwable e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
