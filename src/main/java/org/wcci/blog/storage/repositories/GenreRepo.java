package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wcci.blog.models.Author;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface GenreRepo extends CrudRepository<Author, Long> {

    Optional<Author> findGenreById(long id);
    Collection<Author> findAll();

}
