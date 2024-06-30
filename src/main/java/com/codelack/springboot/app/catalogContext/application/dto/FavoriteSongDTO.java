package com.codelack.springboot.app.catalogContext.application.dto;

import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record FavoriteSongDTO(@NotNull boolean favorite, UUID publicId) {
}
