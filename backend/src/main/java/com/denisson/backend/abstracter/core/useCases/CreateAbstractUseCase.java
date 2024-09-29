package com.denisson.backend.abstracter.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.domain.entities.AbstractEntity;
import com.denisson.backend.abstracter.core.domain.exceptions.GeneralException;

public abstract class CreateAbstractUseCase<T extends AbstractEntity> {
    private final AbstractRepository<T> repository;

    protected CreateAbstractUseCase(AbstractRepository<T> repository) {
        this.repository = repository;
    }

    public void execute(T t) {
        if(repository.existsName(t.getName())) {
            throw new GeneralException(String.format("Name %s already exists.", t.getName()));
        }
        repository.save(t);
    }

}
