package com.radhakrushna.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.radhakrushna.miniproject.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
