import { useState } from "react";
import axios from "axios";

export default function CreatePost({ onPostCreated }) {
    const [title, setTitle] = useState("");
    const [content, setContent] = useState("");

    const handleSubmit = (e) => {
        e.preventDefault();

        axios
            .post("/posts", {
                title,
                content,
            })
            .then((res) => {
                onPostCreated(res.data); // avisamos al padre que se creó un post
                setTitle("");
                setContent("");
            })
            .catch((err) => {
                console.error("Error al crear post:", err);
            });
    };

    return (
        <form className="create-post-form" onSubmit={handleSubmit}>
            <h2>Crear nuevo post</h2>

            <input
                type="text"
                placeholder="Título"
                value={title}
                onChange={(e) => setTitle(e.target.value)}
                required
            />

            <textarea
                placeholder="Contenido"
                value={content}
                onChange={(e) => setContent(e.target.value)}
                required
            />

            <button type="submit">Publicar</button>
        </form>
    );
}
