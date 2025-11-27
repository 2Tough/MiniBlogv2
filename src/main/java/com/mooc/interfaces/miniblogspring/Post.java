package com.mooc.interfaces.miniblogspring;

import java.time.LocalDateTime;

public class Post {

    private int id;
    private String title;
    private String content;
    private LocalDateTime date;

    // 🔹 Constructor vacío requerido por Spring/Jackson
    public Post() {
        this.date = LocalDateTime.now();
    }

    // 🔹 Constructor que seguirás usando internamente si lo deseas
    public Post(String title, String content) {
        this.title = title;
        this.content = content;
        this.date = LocalDateTime.now();
    }

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}
