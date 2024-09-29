package com.denisson.backend.product.adapter.interfaces;

import com.denisson.backend.product.core.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringProduct extends JpaRepository<Product, Long> {
    boolean existsByName(String name);
    Optional<Product> findByName(String name);
}
