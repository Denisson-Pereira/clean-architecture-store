package com.denisson.backend.product.core.useCases;

import com.denisson.backend.abstracter.adapter.gateway.AbstractRepository;
import com.denisson.backend.abstracter.core.useCases.DeleteByIdAbstractUseCase;
import com.denisson.backend.product.core.domain.entities.Product;

public class DeleteByIdProductUseCase extends DeleteByIdAbstractUseCase<Product> {
    public DeleteByIdProductUseCase(AbstractRepository<Product> repository) {
        super(repository);
    }

    @Override
    protected String getNameEntity() {
        return "Product";
    }
}
