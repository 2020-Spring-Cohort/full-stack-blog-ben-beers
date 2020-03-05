package org.wcci.blog.storage;

import org.springframework.stereotype.Component;
import org.wcci.blog.models.Genre;

import java.util.Collection;

@Component
public interface GenreStorage {
    Collection<Genre> findAllGenres();
    void store(Genre genre);
    Genre findGenreById(long id);
}
