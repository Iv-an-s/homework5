package com.isemenov.spring.homework5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
    private static SessionFactory factory;

    public static void init(){
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public static void shutdown(){
        if (factory != null){
            factory.close();
        }
    }

    public static void main(String[] args) {
        try{
            init();

            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Product oldProduct = session.get(Product.class, 1L);
            System.out.println(oldProduct);
            session.getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            shutdown();
        }
    }
}
