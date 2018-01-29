package com.accp.renting.controller;

import com.accp.renting.biz.UsersBiz;
import com.accp.renting.entity.Users;
import com.accp.renting.util.HibernateUtil;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class Userscontroller {
    private UsersBiz usersBiz=new UsersBiz();

   @RequestMapping("login")
    public String login(){
       return "login";
   }
   @RequestMapping("register")
    public String register(Users users, HttpSession session, Model model){
        Users users1=usersBiz.register(users);
        if(users1!=null){
            session.setAttribute("users",users1);
            model.addAttribute("users",users1);
            return "fixed";
        }else{
            return login();
        }


   }
}
