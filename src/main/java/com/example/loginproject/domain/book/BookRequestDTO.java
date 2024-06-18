package com.example.loginproject.domain.book;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookRequestDTO(
        @NotBlank
        String name,
        @NotNull
        Double rating
) {
}
