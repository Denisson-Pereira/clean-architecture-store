package com.denisson.backend.product.infra;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.product.core.domain.entities.Product;
import com.denisson.backend.product.core.useCases.CreateProductUseCase;
import com.denisson.backend.product.core.useCases.GetAllProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConf {

    @Bean
    public CreateProductUseCase createProductUseCase(AbstractRepository<Product> productRepository) {
        return new CreateProductUseCase(productRepository);
    }

    @Bean
    public GetAllProductUseCase getAllProductUseCase(AbstractRepository<Product> productRepository) {
        return new GetAllProductUseCase(productRepository);
    }
}
