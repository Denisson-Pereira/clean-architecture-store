package com.denisson.backend.abstracter.adapter.gateway;

import com.denisson.backend.abstracter.core.domain.entities.AbstractEntity;

import java.util.List;
import java.util.Optional;

public interface AbstractRepository<T> {
    T save(T t);
    List<T> findAll();
    Optional<T> findById(Long id);
    void delete(Long id);
    boolean existsById(Long id);
    boolean existsName(String name);
    Optional<T> findByName(String name);
}
