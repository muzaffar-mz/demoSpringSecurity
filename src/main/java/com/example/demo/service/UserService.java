package com.example.demo.service;

import com.example.demo.domain.Role;
import com.example.demo.domain.User;

import java.util.List;

/**
 * Created by Muzaffar Muratov on 11/23/2022.
 */


public interface UserService {
     User saveUser(User user);
     Role saveRole(Role role);
     void addRoleToUser(String username, String roleName);
     User getUser(String username);
     List<User> getUsers();
}
