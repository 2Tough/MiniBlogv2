import React, { useEffect, useState } from "react";
import axios from "axios";

export default function PostList() {
    const [posts, setPosts] = useState([]);
    const [loading, setLoading] = useState(true);

    // esto corre una sola vez cuando el componente se monta
    useEffect(() => {
        axios
            .get("/posts")   // gracias al proxy de Vite → http://localhost:8080/posts
            .then((res) => {
                setPosts(res.data);
            })
            .catch((err) => {
                console.error("Error fetching posts:", err);
            })
            .finally(() => setLoading(false));
    }, []);

    if (loading) return <div>Loading posts...</div>;

    if (posts.length === 0)
        return (
            <div className="posts-list">
                <h2>Posts</h2>
                <p>No posts found.</p>
            </div>
        );

    return (
        <div className="posts-list">
            <h2>Posts</h2>
            {posts.map((p) => (
                <div key={p.id} className="post-card">
                    <h3>{p.title}</h3>
                    <p>{p.content}</p>
                    <small>{p.date}</small>
                    <hr />
                </div>
            ))}
        </div>
    );
}
