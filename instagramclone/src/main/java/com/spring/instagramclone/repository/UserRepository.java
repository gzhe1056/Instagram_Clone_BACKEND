package com.spring.instagramclone.repository;

import com.spring.instagramclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User save(User user);
    User findByUserId(String userId);
}
