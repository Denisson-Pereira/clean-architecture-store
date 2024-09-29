package com.denisson.backend.categories.infra;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.categories.core.domain.entities.Category;
import com.denisson.backend.categories.core.useCases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CategoryConf {

    @Bean
    public CreateCategoryUseCase createCategoryUseCase(AbstractRepository<Category> categoryAbstractRepository) {
        return new CreateCategoryUseCase(categoryAbstractRepository);
    }

    @Bean
    public GetAllCategoryUseCase getAllCategoryUseCase(AbstractRepository<Category> categoryAbstractRepository) {
        return new GetAllCategoryUseCase(categoryAbstractRepository);
    }

    @Bean
    public GetByIdCategoryUseCase getByIdCategoryUseCase(AbstractRepository<Category> categoryAbstractRepository) {
        return new GetByIdCategoryUseCase(categoryAbstractRepository);
    }

    @Bean
    public UpdateByIdCategoryUseCase updateByIdCategoryUseCase(AbstractRepository<Category> categoryAbstractRepository) {
        return new UpdateByIdCategoryUseCase(categoryAbstractRepository);
    }

    @Bean
    public DeleteByIdCategoryUseCase deleteByIdCategoryUseCase(AbstractRepository<Category> productAbstractRepository) {
        return new DeleteByIdCategoryUseCase(productAbstractRepository);
    }
}
