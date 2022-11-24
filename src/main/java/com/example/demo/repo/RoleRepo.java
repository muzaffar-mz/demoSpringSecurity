package com.example.demo.repo;

import com.example.demo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Muzaffar Muratov on 11/23/2022.
 */


public interface RoleRepo extends JpaRepository<Role, Long> {
     Role findByName(String name);
}
