package org.wcci.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.models.Author;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.PostStorage;

import java.util.HashMap;

@Controller
public class AuthorController {
    private HashMap<Long, Author> authors = new HashMap<Long,Author>();
    private final AuthorStorage authorStorage;
    private PostStorage postStorage;

    public AuthorController(AuthorStorage authorStorage, PostStorage postStorage){
        this.authorStorage = authorStorage;
        this.postStorage = postStorage;
        Author ben = new Author("Ben");
        this.authors.put(ben.getId(),ben);

    }

    @RequestMapping("/authors/{id}")
    public String displaySingleAuthor(@PathVariable Long id, Model model){
        Author retrieveAuthor = authorStorage.findAuthorById(id);
        model.addAttribute("author",retrieveAuthor);
        return "AuthorTemplate";
    }




}
