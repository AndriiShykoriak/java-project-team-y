package ua.com.shop.service;

import ua.com.shop.model.Product;

import java.util.List;

public interface ProductService {
    void save(Product product);
    Product findOne(int id);
    List<Product> findAll();
}
