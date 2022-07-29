package com.ironhack.commentservice.controller.impl;

import com.ironhack.commentservice.model.Comment;
import com.ironhack.commentservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class CommentControllerImpl {
    @Autowired
    CommentRepository commentRepository;

    @GetMapping("/comments/{city}")
    @ResponseStatus(HttpStatus.OK)
    public List<Comment> findByCity(@PathVariable String city) {
        return commentRepository.findByCity(city);
    }

    @PostMapping("/comments")
    @ResponseStatus(HttpStatus.CREATED)
    public Comment createComment(@RequestBody Comment comment) {
        return commentRepository.save(comment);
    }

}
