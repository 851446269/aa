package com.accp.renting.dao;

import com.accp.renting.biz.District;
import com.accp.renting.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class DistrictDao {
    private Session session = HibernateUtil.openSession();
    public List<District> districtList(){

        return null;
    }
         }
