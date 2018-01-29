package com.accp.renting.test;

import com.accp.renting.entity.District;
import com.accp.renting.entity.Street;
import com.accp.renting.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Session session = HibernateUtil.openSession();
        Transaction transaction = session.beginTransaction();
        District district=new District();
        district.setName("张三");
        Street street1=new Street();
        street1.setName("小明");
        Street street2=new Street();
        street2.setName("小红");
        Set<Street> streets=new HashSet<Street>();
        streets.add(street1);
        streets.add(street2);
        district.setStreets(streets);
        Integer save =(Integer) session.save(district);
        transaction.commit();
        District o =(District) session.get(District.class, save);
        System.out.println(o);
        for (Street s:o.getStreets()){
            System.out.println(s);
        }

    }
}
