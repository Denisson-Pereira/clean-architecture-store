package com.denisson.backend.categories.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.CreateAbstractUseCase;
import com.denisson.backend.categories.core.domain.entities.Category;

public class CreateCategoryUseCase extends CreateAbstractUseCase<Category> {
    public CreateCategoryUseCase(AbstractRepository<Category> repository) {
        super(repository);
    }
}
