package com.fullstack.service;

import com.fullstack.model.Product;

import java.util.List;

public interface IProductService {

    Product save(Product product);

    List<Product> findAll();
}
