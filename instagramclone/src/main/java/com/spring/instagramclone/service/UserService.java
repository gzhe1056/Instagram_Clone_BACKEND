package com.spring.instagramclone.service;

import com.spring.instagramclone.entity.User;
import com.spring.instagramclone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User submitUserMetaData(User user) {
        return userRepository.save(user);
    }
    public User displayUserMetaData(String userid) {
        return userRepository.findByUserId(userid);
    }
}
