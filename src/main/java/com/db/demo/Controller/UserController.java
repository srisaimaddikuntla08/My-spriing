package com.db.demo.Controller;


import com.db.demo.Entity.UserEntity;
import com.db.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public ResponseEntity<Map<Integer, UserEntity>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody UserEntity userEntity){
        return ResponseEntity.ok(userService.createUser(userEntity));
    }

}
