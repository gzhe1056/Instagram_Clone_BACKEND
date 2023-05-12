package com.spring.instagramclone.controller;

import com.spring.instagramclone.entity.Comment;
import com.spring.instagramclone.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping
    private Comment submitComment(@RequestBody Comment comment) {
        return commentService.submitComment(comment);
    }

    @GetMapping("/{postId}")
    private ArrayList<Comment> getCommentForPost(@PathVariable("postId") String postId) {
        return commentService.getAllComments(postId);
    }
}
