package com.hraf.controller;

import com.hraf.dao.CommentRepository;
import com.hraf.dao.PostRepository;
import com.hraf.dao.UserRepository;
import com.hraf.entities.Comment;
import com.hraf.entities.Post;
import com.hraf.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CommentRepository commentRepository;
    //*************UserController*************************
    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
    @GetMapping("/users/{userId}")
    public User getUser(@PathVariable long userId){
        return userRepository.getOne(userId);
    }
    @GetMapping("/users/{userId}/posts")
    public List<Post> getUserPosts(@PathVariable long userId){
        return userRepository.getPosts(userId);
    }
    @GetMapping("/users/{userId}/posts/{postId}")
    public Post getUserPost(@PathVariable long userId , @PathVariable long postId){
        return userRepository.getPostsById(userId,postId);
    }
    @GetMapping("/users/{userId}/comments")
    public List<Comment> getUserComments(@PathVariable long userId){
        return userRepository.getComments(userId);
    }



    //***************Post Controller **********************
    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/posts/{postId}")
    public Post getPost(@PathVariable long postId){
        return postRepository.getOne(postId);
    }

    @GetMapping("/posts/{postId}/comments")
    public List<Comment> getPostComments(@PathVariable long postId){
        return postRepository.getComments(postId);
    }

    @GetMapping("/posts/{postId}/likes")
    public int getPostLikes(@PathVariable long postId){
        return postRepository.getLikes(postId).size();
    }

    //****************Comments Controller*********************
    @GetMapping("/comments")
    public List<Comment> getComments(){
        return commentRepository.findAll();
    }
    @GetMapping("/comments/{commentId}")
    public Comment getComment(@PathVariable long commentId){
        return commentRepository.getOne(commentId);
    }

}
