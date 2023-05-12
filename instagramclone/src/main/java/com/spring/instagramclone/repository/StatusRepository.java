package com.spring.instagramclone.repository;

import com.spring.instagramclone.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface StatusRepository extends CrudRepository<Status, Integer> {

    Status save(Status save);
    ArrayList<Status> findAll();
}
