package com.denisson.backend.categories.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.GetByIdAbstractUseCase;
import com.denisson.backend.categories.core.domain.entities.Category;

public class GetByIdCategoryUseCase extends GetByIdAbstractUseCase<Category, AbstractRepository<Category>> {
    public GetByIdCategoryUseCase(AbstractRepository<Category> repository) {
        super(repository);
    }


    @Override
    protected String getNameEntity() {
        return "Category";
    }
}
