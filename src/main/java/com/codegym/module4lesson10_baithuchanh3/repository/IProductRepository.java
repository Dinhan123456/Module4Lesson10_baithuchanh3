package com.codegym.module4lesson10_baithuchanh3.repository;

import com.codegym.module4lesson10_baithuchanh3.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
}
