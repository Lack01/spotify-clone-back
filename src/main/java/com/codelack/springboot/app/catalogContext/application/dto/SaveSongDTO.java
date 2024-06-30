package com.codelack.springboot.app.catalogContext.application.dto;

import com.codelack.springboot.app.catalogContext.application.vo.SongAuthorVO;
import com.codelack.springboot.app.catalogContext.application.vo.SongTitleVO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record SaveSongDTO (@Valid SongTitleVO songTitleVO,
                          @Valid SongAuthorVO songAuthorVO,
                          @NotNull byte[] cover,
                          @NotNull String coverContentType,
                          @NotNull byte[] file,
                          @NotNull String fileContentType) {

}
