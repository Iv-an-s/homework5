package com.isemenov.spring.homework5;

import java.util.List;

public interface ProductDao {
    Product findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);

    Product saveOrUpdate(Product product);

    Product findByTitle(String title);
}
