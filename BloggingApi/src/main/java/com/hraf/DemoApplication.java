package com.hraf;

import com.hraf.dao.CommentRepository;
import com.hraf.dao.LikeRepository;
import com.hraf.dao.PostRepository;
import com.hraf.dao.UserRepository;
import com.hraf.entities.Like;
import com.hraf.entities.Post;
import com.hraf.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(DemoApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
//        userRepository.save(new User("user1","user1@gmail.com"));
//        userRepository.save(new User("user2","user2@gmail.com"));
//        userRepository.save(new User("user3","user3@gmail.com"));

        User user1 = userRepository.getOne(1L);
        User user2 = userRepository.getOne(2L);
        User user3 = userRepository.getOne(3L);
        PostRepository postRepository = context.getBean(PostRepository.class);

        Post post1 = postRepository.getOne(5L);
        Post post2 = postRepository.getOne(6L);
        Post post3 = postRepository.getOne(7L);
        Post post4 = postRepository.getOne(8L);
        Post post5 = postRepository.getOne(9L);
        Post post6 = postRepository.getOne(10L);
//        postRepository.save(new Post("post1","This is Post 1 ",user1));
//        postRepository.save(new Post("post2","This is Post 2 ",user1));
//
//        postRepository.save(new Post("post3","This is Post 3 ",user2));
//        postRepository.save(new Post("post4","This is Post 4 ",user2));
//
//        postRepository.save(new Post("post5","This is Post 5 ",user3));
//        postRepository.save(new Post("post6","This is Post 6 ",user3));
        CommentRepository commentRepository = context.getBean(CommentRepository.class);
//        commentRepository.save(new Comment("This is Comment 1 ",user2,post1));
//        commentRepository.save(new Comment("This is Comment 2 ",user3,post2));
//        commentRepository.save(new Comment("This is Comment 3 ",user1,post3));
//        commentRepository.save(new Comment("This is Comment 4 ",user3,post4));
//        commentRepository.save(new Comment("This is Comment 5 ",user1,post5));
//        commentRepository.save(new Comment("This is Comment 6",user2,post6));

        LikeRepository likeRepository = context.getBean(LikeRepository.class);
//        likeRepository.save(new Like(user1,post3));
//        likeRepository.save(new Like(user1,post4));
//        likeRepository.save(new Like(user1,post5));
//        likeRepository.save(new Like(user1,post6));
//        likeRepository.save(new Like(user2,post1));
//        likeRepository.save(new Like(user2,post2));
//        likeRepository.save(new Like(user2,post5));
//        likeRepository.save(new Like(user2,post6));
//
//
//        likeRepository.save(new Like(user3,post1));
//        likeRepository.save(new Like(user3,post2));
//        likeRepository.save(new Like(user3,post3));
//        likeRepository.save(new Like(user3,post4));

       // List<Like> likes = likeRepository.findAll();
    }

}
