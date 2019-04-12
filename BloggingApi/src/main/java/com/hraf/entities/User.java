package com.hraf.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String userName;
    private String email;
    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL)
    private List<Post> posts;
    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Comment> comments;

    @OneToMany(mappedBy = "user" , cascade = CascadeType.ALL)
    private List<Like> likes;

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

//    public List<Post> getPosts() {
//        return posts;
//    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

//    public List<Comment> getComments() {
//        return comments;
//    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public User() {
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
