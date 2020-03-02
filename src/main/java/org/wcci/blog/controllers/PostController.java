package org.wcci.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.PostStorage;

@Controller
public class PostController {

    private final PostStorage postStorage;

    public PostController(PostStorage postStorage){
        this.postStorage = postStorage;
    }

    @RequestMapping("/post/{id}")
    public String displayPost(@PathVariable Long id, Model model){
        Post retrievedPost = postStorage.findPostById(id);
        model.addAttribute("Post",retrievedPost);
        return "PostTemplate";
    }


}
