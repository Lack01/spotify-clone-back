package com.codelack.springboot.app.catalogContext.repository;

import com.codelack.springboot.app.catalogContext.domain.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
