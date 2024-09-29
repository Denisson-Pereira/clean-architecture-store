package com.denisson.backend.categories.adapter.controller;

import com.denisson.backend.abstracter.adapter.controller.AbstractController;
import com.denisson.backend.categories.adapter.dtos.CategoryDTO;
import com.denisson.backend.categories.core.domain.entities.Category;
import com.denisson.backend.categories.core.useCases.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("categories")
public class CategoryController extends AbstractController<Category, Long, CategoryDTO> {

    @Autowired
    CreateCategoryUseCase createCategoryUseCase;
    @Autowired
    GetAllCategoryUseCase getAllCategoryUseCase;
    @Autowired
    GetByIdCategoryUseCase getByIdCategoryUseCase;
    @Autowired
    UpdateByIdCategoryUseCase updateByIdCategoryUseCase;
    @Autowired
    DeleteByIdCategoryUseCase deleteByIdCategoryUseCase;

    @Override
    protected Object executeCreateUseCase(Category category) {
        return createCategoryUseCase.execute(category);
    }

    @Override
    protected List<Category> executeGetAllUseCase() {
        return getAllCategoryUseCase.execute();
    }

    @Override
    protected Object executeGetByIdUseCase(Long id) {
        return getByIdCategoryUseCase.execute(id);
    }

    @Override
    protected Object executeUpdateByIdUseCase(Long id, CategoryDTO categoryDTO) {
        return updateByIdCategoryUseCase.execute(id, categoryDTO);
    }

    @Override
    protected String executeDeleteByIdUseCase(Long id) {
        return deleteByIdCategoryUseCase.execute(id);
    }
}
