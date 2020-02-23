package org.wcci.blog;

import java.time.LocalDate;

public class BlogPost {
    private String author;
    private LocalDate date;
    private String reviewText;

    public BlogPost(String author, LocalDate date, String reviewText) {
        this.author = author;
        this.date = date;
        this.reviewText = reviewText;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getText() {
        return reviewText;
    }
}
