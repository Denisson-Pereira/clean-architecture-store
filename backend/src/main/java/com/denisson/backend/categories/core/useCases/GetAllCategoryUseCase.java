package com.denisson.backend.categories.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.GetAllAbstractUseCase;
import com.denisson.backend.categories.core.domain.entities.Category;

public class GetAllCategoryUseCase extends GetAllAbstractUseCase<Category> {
    public GetAllCategoryUseCase(AbstractRepository<Category> repository) {
        super(repository);
    }
}
