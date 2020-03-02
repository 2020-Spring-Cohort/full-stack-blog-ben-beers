package org.wcci.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.wcci.blog.models.Author;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.AuthorStorage;
import org.wcci.blog.storage.PostStorage;

import java.util.Collection;

@SpringBootApplication
@EnableJpaRepositories("org.wcci.blog.storage.repositories")

public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @Bean
    public PostStorage postStorage(){
        return new PostStorage() {
            @Override
            public Post findPostById(Long id) {
                return null;
            }

            @Override
            public void store(Post postToStore) {

            }
        };
    }

    @Bean
    public AuthorStorage authorStorage(){
        return new AuthorStorage() {
            @Override
            public Collection<Author> findAllAuthors() {
                return null;
            }

            @Override
            public void store(Author author) {

            }

            @Override
            public Author findAuthorById(long id) {
                return null;
            }
        };
    }

}
