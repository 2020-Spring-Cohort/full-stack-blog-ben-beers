package org.wcci.blog.storage;

import org.springframework.stereotype.Component;
import org.wcci.blog.models.Author;

import java.util.Collection;

@Component
public interface AuthorStorage {
    Collection<Author> findAllAuthors();
    void store(Author author);
    Author findAuthorById(long id);
}
