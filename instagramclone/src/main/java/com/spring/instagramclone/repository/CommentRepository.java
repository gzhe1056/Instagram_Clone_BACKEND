package com.spring.instagramclone.repository;

import com.spring.instagramclone.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {
    Comment save(Comment comment);
    ArrayList<Comment> findAllByPostId(String postId);
    ArrayList<Comment> findAll();
}
