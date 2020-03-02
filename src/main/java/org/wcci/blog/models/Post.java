package org.wcci.blog.models;

import javax.persistence.*;
import java.util.*;

import javax.persistence.ManyToOne;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Author author;

    @Lob //blog posts can be much longer than 255 char
    String text;

    public Post(Author author, String Text){
        this.author = author;
        this.text = text;
    }

    public Post(){}

    public Long getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }


    public void setText(String text) {
        this.text = text;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, author);
    }


}
