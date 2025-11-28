# MiniBlog React App

[![React](https://img.shields.io/badge/React-18+-blue.svg)](https://react.dev/)
[![Node.js](https://img.shields.io/badge/Node.js-18+-green.svg)](https://nodejs.org/)
[![Express](https://img.shields.io/badge/Express.js-4+-lightgrey.svg)](https://expressjs.com/)
[![Axios](https://img.shields.io/badge/Axios-HTTP%20Client-orange.svg)](https://axios-http.com/)

A simple full‑stack **mini blog application** demonstrating:

* React functional components with hooks (`useState`, `useEffect`)
* Props drilling for creating, updating, and deleting posts
* Axios for interacting with a REST API
* CRUD operations (Create, Read, Update, Delete)
* Basic UI state control (editing mode, showing recent posts, toggling lists)

---

## 📌 Description

**MiniBlog** is a lightweight blog application built with **React** on the frontend and any REST-compatible backend (e.g., Express.js). It allows users to:

* Create new posts
* View the most recent post or all posts
* Edit existing posts
* Delete posts
* Update the list in real-time without refreshing (React state)

The app is designed to be minimal, clean, and beginner-friendly while demonstrating real-world component communication.

---

## ⭐ Features

* **CreatePost Component** communicates with the parent and sends new posts upward
* **PostList Component** handles display, edit mode, and deletion
* Real-time UI updates via React state
* Toggle between showing *only the newest post* or *all posts*
* Axios integration for API calls
* Clean and clear component structure

---

## 🖼️ Screenshot

<img width="825" height="926" alt="image" src="https://github.com/user-attachments/assets/a4195a45-b7bb-4389-b9bf-e6f9be08d597" />

```

## 🚀 How to Run

### Requirements

* Node.js 18+
* npm or yarn
* A backend API with the following routes:

  * `GET /posts`
  * `POST /posts`
  * `PUT /posts/:id`
  * `DELETE /posts/:id`

---

### Frontend Setup

1. Clone the repository:

```bash
git clone MiniBlogSpring
cd MiniBlogSpring
```

2. Install dependencies:

```bash
npm install
```

3. Start the development server:

```bash
npm run dev
```

Your app will run at:

```
http://localhost:5173
```

---

## 📁 Project Structure

```
src/
  ├── App.jsx
  ├── components/
  │     ├── CreatePost.jsx
  │     └── PostList.jsx
  ├── App.css
  └── main.jsx
```

---

## 📡 API Endpoints (Expected Backend)

| Method | Endpoint   | Description       |
| ------ | ---------- | ----------------- |
| GET    | /posts     | Get all posts     |
| POST   | /posts     | Create a new post |
| PUT    | /posts/:id | Update a post     |
| DELETE | /posts/:id | Delete a post     |

---

## 🧠 Component Interaction Summary

* `CreatePost` → calls `onPostCreated` → parent (`App.jsx`) updates state
* `PostList` → calls `onUpdate` or `onDelete` → parent updates state
* Parent (`App.jsx`) always holds the **source of truth** (posts state)
* UI updates instantly based on updated state

---

## 📜 License

MIT License
