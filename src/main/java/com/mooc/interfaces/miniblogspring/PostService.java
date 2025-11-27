package com.mooc.interfaces.miniblogspring;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(String title, String content) {
        // aquí podríamos validar cosas
        return postRepository.createPost(title, content);
    }

    public Optional<Post> getPostById(int id) {
        return postRepository.getPostById(id);
    }

    public List<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }

    public boolean updatePost(int id, String newTitle, String newContent) {
        return postRepository.updatePost(id, newTitle, newContent);
    }

    public boolean deletePost(int id) {
        return postRepository.deletePost(id);
    }
}
