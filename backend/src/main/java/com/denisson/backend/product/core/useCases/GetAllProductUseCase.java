package com.denisson.backend.product.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.GetAllAbstractUseCase;
import com.denisson.backend.product.core.domain.entities.Product;

public class GetAllProductUseCase extends GetAllAbstractUseCase<Product> {
    public GetAllProductUseCase(AbstractRepository<Product> repository) {
        super(repository);
    }
}
