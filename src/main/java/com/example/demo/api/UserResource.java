package com.example.demo.api;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Muzaffar Muratov on 11/23/2022.
 */

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
     private final UserService userService;

     @GetMapping("/users")
     public ResponseEntity<List<User>>getUsers() {
          return ResponseEntity.ok().body(userService.getUsers());
     }
}
