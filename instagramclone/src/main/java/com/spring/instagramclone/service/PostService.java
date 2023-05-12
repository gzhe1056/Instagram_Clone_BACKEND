package com.spring.instagramclone.service;

import com.spring.instagramclone.entity.Post;
import com.spring.instagramclone.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    @Autowired
    UserService userService;
    public Post submitPostToDB(Post post) {
        return postRepository.save(post);
    }

    public ArrayList<Post> retrievePostFromDB() {
//        return postRepository.findAll();
        ArrayList<Post> postList = postRepository.findAll();

        for (int i=0; i<postList.size(); i++) {
            Post postItem = postList.get(i);
            postItem.setUsername(userService.displayUserMetaData(postItem.getUserId()).getUserId());
        }

        return postList;
    }
}
