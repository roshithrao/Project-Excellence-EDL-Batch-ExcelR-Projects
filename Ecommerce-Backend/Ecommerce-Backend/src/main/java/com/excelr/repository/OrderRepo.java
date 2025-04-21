package com.excelr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excelr.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
}