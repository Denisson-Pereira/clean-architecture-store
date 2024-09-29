package com.denisson.backend.categories.adapter.interfaces;

import com.denisson.backend.categories.core.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringCategory extends JpaRepository<Category, Long> {
    boolean existsByName(String name);
    Optional<Category> findByName(String name);
}
