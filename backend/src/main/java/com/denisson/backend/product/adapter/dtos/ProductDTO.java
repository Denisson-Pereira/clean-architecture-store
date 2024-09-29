package com.denisson.backend.product.adapter.dtos;

public record ProductDTO(
        String name,
        String evaluation,
        String description,
        String price,
        String category,
        String establishment,
        String image
){}
