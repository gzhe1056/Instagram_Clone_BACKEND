package com.spring.instagramclone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity(name="comment")
public class Comment {

    @Id
    @GeneratedValue
    private int id;

    private String commentId;
    private String userId;
    private String postId;
    private Timestamp timeStamp;
    private String comment;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;

    public Comment(int id,
                   String commentId,
                   String userId,
                   String postId,
                   Timestamp timeStamp,
                   String comment) {
        super();
        this.id = id;
        this.commentId = commentId;
        this.userId = userId;
        this.postId = postId;
        this.timeStamp = timeStamp;
        this.comment = comment;
    }

    public Comment() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
