package com.denisson.backend.categories.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.UpdateAbstractByIdUseCase;
import com.denisson.backend.categories.adapter.dtos.CategoryDTO;
import com.denisson.backend.categories.core.domain.entities.Category;

public class UpdateByIdCategoryUseCase extends UpdateAbstractByIdUseCase<Category, CategoryDTO, AbstractRepository<Category>> {
    public UpdateByIdCategoryUseCase(AbstractRepository<Category> repository) {
        super(repository);
    }

    @Override
    protected void updateFields(Category category, CategoryDTO categoryDTO) {
        category.setName(categoryDTO.name());
        category.setImage(categoryDTO.image());
    }
}
