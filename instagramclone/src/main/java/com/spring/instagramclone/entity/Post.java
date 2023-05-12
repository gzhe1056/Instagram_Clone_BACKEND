package com.spring.instagramclone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.sql.Timestamp;

@Entity(name="post")

public class Post {

    @Id
    @GeneratedValue
    private int id;

    private String postId;
    private String userId;
    private String username;
    private String postPath;
    private Timestamp timeStamp;
    private int likeCount;

    public Post() {
        super();
    }

    public Post(int id,
                String postId,
                String userId,
                String postPath,
                Timestamp timeStamp,
                int likeCount) {
        super();
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.postPath = postPath;
        this.timeStamp = timeStamp;
        this.likeCount = likeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPostPath() {
        return postPath;
    }

    public void setPostPath(String postPath) {
        this.postPath = postPath;
    }

    public Timestamp getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Timestamp timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
