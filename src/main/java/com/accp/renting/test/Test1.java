package com.accp.renting.test;

import com.accp.renting.entity.District;
import com.accp.renting.entity.House;
import com.accp.renting.entity.Street;
import com.accp.renting.entity.Users;
import com.accp.renting.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.Serializable;
import java.util.List;

public class Test1 {
   static Session  session = HibernateUtil.openSession();
   static Transaction transaction = session.beginTransaction();
   static  Street s=null;

    public static void main(String[] args) {
        Street street=new Street();
        street.setId(43);
        street.setName("张三z");
        District district=new District();
        district.setId(1004);
        street.setDistrict(district);
       addStreet(street);
        //updateStreet(street);
        //deleteStreet(street);
        System.out.println(s);

    }
    public static void addStreet(Street street){
        Integer save =(Integer)session.save(street);
         s=(Street) session.get(Street.class,save);

        transaction.commit();
    }
    public static void updateStreet(Street street){
        session.update(street);
        transaction.commit();
        s=(Street) session.get(Street.class,street.getId());



    }
    public static void deleteStreet(Street street){
        session.delete(street);
        s=(Street) session.get(Street.class,street.getId());
        transaction.commit();

    }
}
