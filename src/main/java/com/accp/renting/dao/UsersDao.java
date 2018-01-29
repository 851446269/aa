package com.accp.renting.dao;

import com.accp.renting.entity.Users;
import com.accp.renting.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class UsersDao {
    private Session session = HibernateUtil.openSession();
    public Users register(Users users){
        String sql=new String("from Users where name=:name and password=:password");
        Query query = session.createQuery(sql);
        query.setProperties(users);
        List<Users> users1=query.list();
        if(users1.size()>0){
            users=users1.get(0);
        }else{
            users=null;
        }
        return users ;
    }
}
