package com.denisson.backend.product.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.GetByIdAbstractUseCase;
import com.denisson.backend.product.core.domain.entities.Product;

public class GetByIdProductUseCase extends GetByIdAbstractUseCase<Product, AbstractRepository<Product>> {
    public GetByIdProductUseCase(AbstractRepository<Product> repository) {
        super(repository);
    }


    @Override
    protected String getNameEntity() {
        return "Product";
    }
}
