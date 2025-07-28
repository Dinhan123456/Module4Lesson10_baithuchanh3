package com.codegym.module4lesson10_baithuchanh3.service;

import com.codegym.module4lesson10_baithuchanh3.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}
