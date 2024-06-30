package com.codelack.springboot.app.catalogContext.repository;

import com.codelack.springboot.app.catalogContext.domain.Favorite;
import com.codelack.springboot.app.catalogContext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}
