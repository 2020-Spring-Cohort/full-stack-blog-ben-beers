package org.wcci.blog.storage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.wcci.blog.models.Author;
import org.wcci.blog.storage.repositories.AuthorRepo;
import org.wcci.blog.storage.*;

import java.util.Collection;

@Service
public class AuthorStorageJpaImpl {
    @Autowired
    private AuthorRepo authorRepo;
    private Collection<Author> authors;

    public AuthorStorageJpaImpl(AuthorRepo authorRepo){
        this.authorRepo = authorRepo;
    }

    public Collection<Author> findAllAuthors(){
        return (Collection<Author>) authorRepo.findAll();
    }

    public Author findAuthorById(Long id){
        return authorRepo.findAuthorById(id).get();
    }

}
