package com.excelr.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByCategoryId(Long categoryId);
    List<Product> findByNameContainingOrDescriptionContaining(String name, String description);
}