package com.hraf.dao;

import com.hraf.entities.Comment;
import com.hraf.entities.Post;
import com.hraf.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select  p from Post p   where p.user.id = :x")
   public List<Post> getPosts(@Param("x") long userId );
    @Query("select p from Post p where p.user.id = :x and p.id = :y")
    public Post getPostsById(@Param("x") long userId,@Param("y") long postId);
    @Query("select c from Comment c where c.user.id = :x")
    public List<Comment> getComments(@Param("x") long userId);

}

