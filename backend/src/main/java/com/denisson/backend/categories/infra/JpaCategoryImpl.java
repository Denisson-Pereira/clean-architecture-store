package com.denisson.backend.categories.infra;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.categories.adapter.interfaces.SpringCategory;
import com.denisson.backend.categories.core.domain.entities.Category;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaCategoryImpl implements AbstractRepository<Category> {
    private final SpringCategory repository;


    public JpaCategoryImpl(SpringCategory repository) {
        this.repository = repository;
    }

    @Override
    public Category save(Category category) {
        return repository.save(category);
    }

    @Override
    public List<Category> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return repository.existsById(id);
    }

    @Override
    public boolean existsName(String name) {
        return repository.existsByName(name);
    }

    @Override
    public Optional<Category> findByName(String name) {
        return repository.findByName(name);
    }
}
