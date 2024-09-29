package com.denisson.backend.categories.adapter.dtos;

import com.denisson.backend.abstracter.adapter.interfaces.AbstractDTOInterface;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Data Transfer Object (DTO) for representing a category for an establishment.")
public record CategoryDTO(
        @Schema(description = "The name of the category", example = "Awesome Pizza")
        String name,
        @Schema(description = "The image URL representing the category, which may be used for display purposes in client applications.",
                example = "https://example.com/images/category-pizza.png")
        String image
) implements AbstractDTOInterface {
    @Override
    public String getName() {
        return "Category";
    }
}
