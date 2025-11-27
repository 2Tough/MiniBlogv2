package com.mooc.interfaces.miniblogspring;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class InMemoryPostRepository implements PostRepository {

    private final ArrayList<Post> posts = new ArrayList<>();
    private int nextId = 1;

    @Override
    public Post createPost(String title, String content) {
        Post post = new Post(title, content);
        post.setId(nextId++);
        posts.add(post);
        return post;
    }

    @Override
    public Optional<Post> getPostById(int id) {
        return posts.stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public List<Post> getAllPosts() {
        return new ArrayList<>(posts);
    }

    @Override
    public boolean updatePost(int id, String newTitle, String newContent) {
        Optional<Post> post = getPostById(id);
        if (post.isPresent()) {
            post.get().setTitle(newTitle);
            post.get().setContent(newContent);
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePost(int id) {
        return posts.removeIf(p -> p.getId() == id);
    }
}
