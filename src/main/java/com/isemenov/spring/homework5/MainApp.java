package com.isemenov.spring.homework5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        try{
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);

            Product product = productDao.findById(1L);
            System.out.println(product);



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
