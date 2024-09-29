package com.denisson.backend.product.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.CreateAbstractUseCase;
import com.denisson.backend.product.core.domain.entities.Product;

public class CreateProductUseCase extends CreateAbstractUseCase<Product> {
    public CreateProductUseCase(AbstractRepository<Product> repository) {
        super(repository);
    }
}
