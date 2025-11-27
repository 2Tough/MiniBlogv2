package com.mooc.interfaces.miniblogspring;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    Post createPost(String title, String content);
    Optional<Post> getPostById(int id);
    List<Post> getAllPosts();
    boolean updatePost(int id, String newTitle, String newContent);
    boolean deletePost(int id);
}
