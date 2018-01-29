package com.accp.renting.biz;

import com.accp.renting.dao.UsersDao;
import com.accp.renting.entity.Users;

public class UsersBiz {
    UsersDao usersDao=new UsersDao();
    public Users register(Users users){

        return usersDao.register(users);
    }
}
