package com.denisson.backend.abstracter.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;

import java.util.List;

public abstract class GetAllAbstractUseCase<T> {
    private final AbstractRepository<T> repository;

    public GetAllAbstractUseCase(AbstractRepository<T> repository) {
        this.repository = repository;
    }

    public List<T> execute() {
        return repository.findAll();
    }
}
