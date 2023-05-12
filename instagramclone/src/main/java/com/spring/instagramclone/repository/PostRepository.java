package com.spring.instagramclone.repository;

import com.spring.instagramclone.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    Post save(Post post);
    ArrayList<Post> findAll();
}
