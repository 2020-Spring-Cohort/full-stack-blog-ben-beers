package org.wcci.blog;

import org.junit.jupiter.api.Test;
import org.wcci.blog.models.Author;
import org.wcci.blog.models.Post;

public class AuthorTest {
    Post dummyPost = new Post();
    Author underTest = new Author();

    @Test
    public void addPostShouldAddPost(){
    underTest.addPost(dummyPost);
    assert(underTest.getPosts().contains(dummyPost));
    }

}
