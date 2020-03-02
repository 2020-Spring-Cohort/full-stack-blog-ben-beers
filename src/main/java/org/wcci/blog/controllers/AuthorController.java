package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.wcci.blog.models.Author;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.PostStorage;

import java.util.HashMap;

@Controller
public class AuthorController {
    private HashMap<Long, Author> authors;
    private final AuthorStorage authorStorage;

    public AuthorController(AuthorStorage authorStorage){
        this.authorStorage = authorStorage;
    }
}
