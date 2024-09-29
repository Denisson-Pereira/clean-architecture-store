package com.denisson.backend.product.adapter.controller;

import com.denisson.backend.abstracter.adapter.controller.AbstractController;
import com.denisson.backend.product.adapter.dtos.ProductDTO;
import com.denisson.backend.product.core.domain.entities.Product;
import com.denisson.backend.product.core.useCases.GetAllProductUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("products")
public class ProductController extends AbstractController<Product, Long, ProductDTO> {

    @Autowired
    GetAllProductUseCase getAllProductUseCase;


    @Override
    protected Object executeCreateUseCase(Product entity) {
        return null;
    }

    @Override
    protected List<Product> executeGetAllUseCase() {
        return getAllProductUseCase.execute();
    }

    @Override
    protected Object executeGetByIdUseCase(Long aLong) {
        return null;
    }

    @Override
    protected Object executeUpdateByIdUseCase(Long aLong, ProductDTO productDTO) {
        return null;
    }

    @Override
    protected String executeDeleteByIdUseCase(Long aLong) {
        return "";
    }
}
