package com.denisson.backend.product.adapter.dtos;

import com.denisson.backend.abstracter.adapter.interfaces.AbstractDTOInterface;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Data Transfer Object (DTO) for representing a product in the system.")
public record ProductDTO(
        @Schema(description = "The name of the product.", example = "Deluxe Burger")
        String name,

        @Schema(description = "Customer evaluation or rating of the product.", example = "4.5",
                minimum = "0", maximum = "5")
        String evaluation,

        @Schema(description = "Detailed description of the product.", example = "A gourmet burger made with organic ingredients.")
        String description,

        @Schema(description = "Price of the product.", example = "19.99", format = "decimal")
        String price,

        @Schema(description = "Category the product belongs to.", example = "Fast Food")
        String category,

        @Schema(description = "Establishment where the product is available.", example = "Downtown Diner")
        String establishment,

        @Schema(description = "Image URL of the product.", example = "https://example.com/images/burger.png")
        String image
) implements AbstractDTOInterface {
    @Override
    public String getName() {
        return "Product";
    }
}

