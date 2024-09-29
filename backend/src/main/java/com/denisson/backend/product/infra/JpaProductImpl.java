package com.denisson.backend.product.infra;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.product.adapter.interfaces.SpringProduct;
import com.denisson.backend.product.core.domain.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaProductImpl implements AbstractRepository<Product> {
    private final SpringProduct repository;

    public JpaProductImpl(SpringProduct repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public boolean existsName(String name) {
        return false;
    }

    @Override
    public Optional<Product> findByName(String name) {
        return Optional.empty();
    }
}
