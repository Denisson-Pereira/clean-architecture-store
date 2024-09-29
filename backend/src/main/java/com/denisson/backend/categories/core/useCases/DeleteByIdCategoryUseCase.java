package com.denisson.backend.categories.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.DeleteByIdAbstractUseCase;
import com.denisson.backend.categories.core.domain.entities.Category;

public class DeleteByIdCategoryUseCase extends DeleteByIdAbstractUseCase<Category> {
    public DeleteByIdCategoryUseCase(AbstractRepository<Category> repository) {
        super(repository);
    }

    @Override
    protected String getNameEntity() {
        return "Category";
    }
}
