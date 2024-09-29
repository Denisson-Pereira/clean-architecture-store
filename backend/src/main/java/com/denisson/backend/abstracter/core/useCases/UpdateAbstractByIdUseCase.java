package com.denisson.backend.abstracter.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.adapter.interfaces.AbstractDTOInterface;
import com.denisson.backend.abstracter.core.domain.entities.AbstractEntity;
import com.denisson.backend.abstracter.core.domain.exceptions.GeneralException;
import com.denisson.backend.abstracter.core.domain.exceptions.IdNotFoundException;

import java.util.Optional;

public abstract class UpdateAbstractByIdUseCase<T extends AbstractEntity, DTO extends AbstractDTOInterface, Repository extends AbstractRepository<T>> {
    private final Repository repository;

    public UpdateAbstractByIdUseCase(Repository repository) {
        this.repository = repository;
    }

    public T execute(Long id, DTO dto) {
        T entity = findEntityById(id, dto);
        validateNameUniqueness(id, dto);
        updateFields(entity, dto);
        return saveEntity(entity);
    }

    private T findEntityById(Long id, DTO dto) {
        return repository.findById(id)
                .orElseThrow(() -> new IdNotFoundException(dto.getName(), id));
    }

    private void validateNameUniqueness(Long id, DTO dto) {
        Optional<T> entityWithName = repository.findByName(dto.getName());
        if (entityWithName.isPresent() && !entityWithName.get().getId().equals(id)) {
            throw new GeneralException(String.format("Name %s already exists!", dto.getName()));
        }
    }

    protected abstract void updateFields(T entity, DTO dto);

    private T saveEntity(T entity) {
        return repository.save(entity);
    }

}
