package com.isemenov.spring.homework5;

public class MainApp {
    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        try {
            ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);

            productDao.saveOrUpdate(new Product("Fish", 40));

            System.out.println(productDao.findAll());

            productDao.deleteById(4L);

            System.out.println(productDao.findAll());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactoryUtils.shutdown();
        }
    }
}
