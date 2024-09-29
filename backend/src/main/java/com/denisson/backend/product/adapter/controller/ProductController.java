package com.denisson.backend.product.adapter.controller;

import com.denisson.backend.abstracter.adapter.controller.AbstractController;
import com.denisson.backend.product.adapter.dtos.ProductDTO;
import com.denisson.backend.product.core.domain.entities.Product;
import com.denisson.backend.product.core.useCases.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController extends AbstractController<Product, Long, ProductDTO> {

    @Autowired
    CreateProductUseCase createProductUseCase;
    @Autowired
    GetAllProductUseCase getAllProductUseCase;
    @Autowired
    GetByIdProductUseCase getByIdProductUseCase;
    @Autowired
    UpdateByIdProductUseCase updateByIdProductUseCase;
    @Autowired
    DeleteByIdProductUseCase deleteByIdProductUseCase;


    @Override
    protected Object executeCreateUseCase(Product entity) {
        return createProductUseCase.execute(entity);
    }

    @Override
    protected List<Product> executeGetAllUseCase() {
        return getAllProductUseCase.execute();
    }

    @Override
    protected Object executeGetByIdUseCase(Long id) {
        return getByIdProductUseCase.execute(id);
    }

    @Override
    protected Object executeUpdateByIdUseCase(Long id, ProductDTO productDTO) {
        return updateByIdProductUseCase.execute(id, productDTO);
    }

    @Override
    protected String executeDeleteByIdUseCase(Long id) {
        return deleteByIdProductUseCase.execute(id);
    }
}
