package com.denisson.backend.abstracter.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.domain.exceptions.IdNotFoundException;

import java.util.Optional;

public abstract class GetByIdAbstractUseCase<T, Repository extends AbstractRepository<T>> {
    private final Repository repository;

    protected GetByIdAbstractUseCase(Repository repository) {
        this.repository = repository;
    }

    public Optional<T> execute(Long id) {
        if(!repository.existsById(id)) {
            throw new IdNotFoundException(getNameEntity(), id);
        }
        return repository.findById(id);
    }

    protected abstract String getNameEntity();
}
