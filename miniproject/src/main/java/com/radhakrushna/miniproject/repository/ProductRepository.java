package com.radhakrushna.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.radhakrushna.miniproject.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}