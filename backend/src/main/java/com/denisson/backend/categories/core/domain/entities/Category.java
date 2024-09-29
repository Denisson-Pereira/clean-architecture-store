package com.denisson.backend.categories.core.domain.entities;

import com.denisson.backend.abstracter.core.domain.entities.AbstractEntity;
import jakarta.persistence.Entity;

@Entity
public class Category extends AbstractEntity {

    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
