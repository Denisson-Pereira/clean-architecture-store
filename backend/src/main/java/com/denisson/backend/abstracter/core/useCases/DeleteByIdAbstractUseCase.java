package com.denisson.backend.abstracter.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.domain.exceptions.IdNotFoundException;

public abstract class DeleteByIdAbstractUseCase<T> {
    private final AbstractRepository<T> repository;

    protected DeleteByIdAbstractUseCase(AbstractRepository<T> repository) {
        this.repository = repository;
    }

    public String execute(Long id) {
        if(!repository.existsById(id)) {
            throw new IdNotFoundException(getNameEntity(), id);
        }

        repository.delete(id);
        return String.format("Id %s deleted.", id);
    }

    protected abstract String getNameEntity();
}
