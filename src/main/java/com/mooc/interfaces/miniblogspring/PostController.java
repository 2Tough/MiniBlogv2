package com.mooc.interfaces.miniblogspring;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // GET /posts → devuelve todos los posts
    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    // GET /posts/{id} → devuelve un post por ID
    @GetMapping("/{id}")
    public Optional<Post> getPostById(@PathVariable int id) {
        return postService.getPostById(id);
    }

    // POST /posts → crea un post nuevo
    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post.getTitle(), post.getContent());
    }

    // PUT /posts/{id} → actualiza un post existente
    @PutMapping("/{id}")
    public boolean updatePost(@PathVariable int id, @RequestBody Post post) {
        return postService.updatePost(id, post.getTitle(), post.getContent());
    }

    // DELETE /posts/{id} → elimina un post
    @DeleteMapping("/{id}")
    public boolean deletePost(@PathVariable int id) {
        return postService.deletePost(id);
    }
}
