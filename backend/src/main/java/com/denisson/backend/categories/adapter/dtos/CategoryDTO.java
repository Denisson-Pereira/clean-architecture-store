package com.denisson.backend.categories.adapter.dtos;

import com.denisson.backend.abstracter.adapter.interfaces.AbstractDTOInterface;

public record CategoryDTO(
        String name,
        String image
) implements AbstractDTOInterface {
    @Override
    public String getName() {
        return "Category";
    }
}
