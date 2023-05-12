package com.spring.instagramclone.service;

import com.spring.instagramclone.entity.Comment;
import com.spring.instagramclone.entity.Status;
import com.spring.instagramclone.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    UserService userService;

    public Comment submitComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public ArrayList<Comment> getAllComments(String postId) {
//        return commentRepository.findAllByPostId(postId);
        ArrayList<Comment> commentList = commentRepository.findAllByPostId(postId);

        for (int i=0; i<commentList.size(); i++) {
            Comment commentItem = commentList.get(i);
            commentItem.setUsername(userService.displayUserMetaData(commentItem.getUsername()).getUserId());
        }

        return commentList;
    }
}
