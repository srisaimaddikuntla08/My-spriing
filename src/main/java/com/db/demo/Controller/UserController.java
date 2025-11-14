package com.db.demo.Controller;

import com.db.demo.Model.UserModel;
import com.db.demo.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        this.userService= userService;
    }
    @GetMapping("/user")
    public ResponseEntity<List<UserModel>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody UserModel userModel){
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userModel));
    }


}
