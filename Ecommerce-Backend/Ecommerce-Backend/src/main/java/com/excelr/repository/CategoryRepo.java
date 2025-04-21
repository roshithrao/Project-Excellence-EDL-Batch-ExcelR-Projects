package com.excelr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Long>{

}
