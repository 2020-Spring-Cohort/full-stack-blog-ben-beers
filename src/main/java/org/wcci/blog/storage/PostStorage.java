package org.wcci.blog.storage;

import org.hibernate.annotations.Generated;
import org.springframework.stereotype.Component;
import org.wcci.blog.models.Post;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Component
public interface PostStorage {


    Post findPostById(Long id);

    void store(Post postToStore);

}
