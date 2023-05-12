package com.spring.instagramclone.service;

import com.spring.instagramclone.entity.Status;
import com.spring.instagramclone.repository.StatusRepository;
import com.spring.instagramclone.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StatusService {

    @Autowired
    StatusRepository statusRepository;

    @Autowired
    UserService userService;

    public Status submitData(Status status) {
        return statusRepository.save(status);
    }
    public ArrayList<Status> retrieveStatus() {

//        ArrayList<Status> statusList = statusRepository.findAll();
//
//        for (int i=0; i<statusList.size(); i++) {
//            Status statusItem = statusList.get(i);
//            statusItem.setUsername(userService.displayUserMetaData(statusItem.getUserId()).getUserId());
//        }
//
//        return statusList;
        return statusRepository.findAll();
    }
}
