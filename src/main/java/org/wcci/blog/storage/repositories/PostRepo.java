package org.wcci.blog.storage.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.wcci.blog.models.Post;

import java.util.Optional;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {

    Optional<Post> findById(Long id);

}
