package com.denisson.backend.product.infra;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.product.core.domain.entities.Product;
import com.denisson.backend.product.core.useCases.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConf {

    @Bean
    public CreateProductUseCase createProductUseCase(AbstractRepository<Product> productAbstractRepository) {
        return new CreateProductUseCase(productAbstractRepository);
    }

    @Bean
    public GetAllProductUseCase getAllProductUseCase(AbstractRepository<Product> productAbstractRepository) {
        return new GetAllProductUseCase(productAbstractRepository);
    }

    @Bean
    public GetByIdProductUseCase getByIdProductUseCase(AbstractRepository<Product> productAbstractRepository) {
        return new GetByIdProductUseCase(productAbstractRepository);
    }

    @Bean
    public UpdateByIdProductUseCase updateByIdProductUseCase(AbstractRepository<Product> productAbstractRepository) {
        return new UpdateByIdProductUseCase(productAbstractRepository);
    }

    @Bean
    public DeleteByIdProductUseCase deleteByIdProductUseCase(AbstractRepository<Product> productAbstractRepository) {
        return new DeleteByIdProductUseCase(productAbstractRepository);
    }
}
