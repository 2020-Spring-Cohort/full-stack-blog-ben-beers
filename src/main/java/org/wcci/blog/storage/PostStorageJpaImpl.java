package org.wcci.blog.storage;

import org.springframework.stereotype.Service;
import org.wcci.blog.models.Post;
import org.wcci.blog.storage.repositories.PostRepo;

@Service
public class PostStorageJpaImpl {
    private final PostRepo postRepo;

    public PostStorageJpaImpl(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    public Post findPostById(Long id){
        return postRepo.findById(id).get();
    }

    public void store(Post post){
        postRepo.save(post);
    }



}
