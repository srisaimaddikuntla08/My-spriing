package com.db.demo.User;


import com.db.demo.UsreEntity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private UserEntity userEntity;

    @GetMapping("/")
    public UserEntity createUser(){
        return new UserEntity(1,"sai@gmail.com");
    }

}
