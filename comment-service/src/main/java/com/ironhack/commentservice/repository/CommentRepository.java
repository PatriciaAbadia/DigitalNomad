package com.ironhack.commentservice.repository;

import com.ironhack.commentservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
    List<Comment> findByCity(String city);

    Comment createComment(String city, Comment comment);

}
