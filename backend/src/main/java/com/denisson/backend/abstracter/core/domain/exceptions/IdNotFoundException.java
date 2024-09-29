package com.denisson.backend.abstracter.core.domain.exceptions;

public class IdNotFoundException extends RuntimeException {
    public IdNotFoundException(String entity, Long id) {
        super(String.format("%s with ID %s not found.", entity, id));
    }
}
