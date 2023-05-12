package com.spring.instagramclone.controller;

import com.spring.instagramclone.entity.Status;
import com.spring.instagramclone.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    StatusService statusService;

    @PostMapping("")
    private Status submitStatus(@RequestBody Status status) {
        return statusService.submitData(status);
    }

    @GetMapping("")
    private ArrayList<Status> getAllStatus() {
        return statusService.retrieveStatus();
    }
}
