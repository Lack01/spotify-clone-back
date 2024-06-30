package com.codelack.springboot.app.catalogContext.application.dto;

import jakarta.persistence.Lob;

import java.util.UUID;

public record SaveContentDTO(UUID publicId, @Lob byte[] file, String fileContentType) {
}
