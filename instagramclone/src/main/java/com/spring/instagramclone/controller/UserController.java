package com.spring.instagramclone.controller;

import com.spring.instagramclone.entity.User;
import com.spring.instagramclone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("")
    private User submitUser(@RequestBody User user) {
        return userService.submitUserMetaData(user);
    }

    @GetMapping("/{userid}")
    private User getUserDetails(@PathVariable("userid") String userId) {
        return userService.displayUserMetaData(userId);
    }
}
