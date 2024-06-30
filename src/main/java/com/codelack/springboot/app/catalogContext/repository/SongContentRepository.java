package com.codelack.springboot.app.catalogContext.repository;

import com.codelack.springboot.app.catalogContext.domain.SongContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongContentRepository extends JpaRepository<SongContent, Long> {
}
