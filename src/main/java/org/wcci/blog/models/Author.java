package org.wcci.blog.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private Long id;

    private String name;


    @OneToMany(mappedBy = "author")
    private Collection <Post> posts;

    public Author(){

        this.name = "author";
        this.posts = new ArrayList<Post>();
    }

    public Author(String name){
        this.name = name;
        this.posts = new ArrayList<Post>();
    }

    public Long getId() {
        return id;
    }

    public void addPost(Post post){
        posts.add(post);

    }


    public Collection<Post> getPosts() {
        return posts;
    }
}
