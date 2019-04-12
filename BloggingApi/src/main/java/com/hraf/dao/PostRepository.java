package com.hraf.dao;

import com.hraf.entities.Comment;
import com.hraf.entities.Like;
import com.hraf.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    @Query("select c from Comment c where c.post.id = :x")
    public List<Comment> getComments(@Param("x") long postId);
    @Query("select l from Like l where l.post.id = :x")
    public List<Like> getLikes(@Param("x") long postId);
}
