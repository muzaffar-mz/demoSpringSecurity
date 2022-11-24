package com.example.demo.repo;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Muzaffar Muratov on 11/23/2022.
 */


public interface UserRepo extends JpaRepository<User, Long> {
     User findByUsername(String username);
}
