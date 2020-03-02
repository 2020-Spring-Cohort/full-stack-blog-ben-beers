package org.wcci.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.wcci.blog.models.Author;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.PostStorage;

@Component
public class Populator implements CommandLineRunner {

    AuthorStorage authorStorage;
    PostStorage postStorage;

    public Populator(AuthorStorage authorStorage, PostStorage postStorage){

        this.authorStorage = authorStorage;
        this.postStorage = postStorage;
    }

    @Override
    public void run(String ... args) throws Exception{
        Author ben = new Author("Ben");
        authorStorage.store(ben);
        Post defaultPost = new Post(ben,"Hello, world!");
        postStorage.store(defaultPost);
        ben.addPost(defaultPost);
    }




}
