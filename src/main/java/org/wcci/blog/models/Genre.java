package org.wcci.blog.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Genre {
    private String name;
    @GeneratedValue
    @Id
    private long id;


    public Genre(){
    this.name = "Genre";
    }

    public Genre(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
