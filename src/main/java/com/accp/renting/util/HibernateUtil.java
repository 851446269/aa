package com.accp.renting.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private  static SessionFactory factory=null;
    static {
        Configuration config=new Configuration();
        config.configure("hibernate.xml");
        factory=config.buildSessionFactory();
    }
    public static Session openSession(){
        return factory.openSession();
    }
}
