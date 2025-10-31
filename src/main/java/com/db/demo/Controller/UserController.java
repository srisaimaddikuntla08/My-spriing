package com.db.demo.Controller;


import com.db.demo.Entity.UserEntity;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class UserController {

    private final Map<Integer, UserEntity> userDb = new HashMap<>();


    @GetMapping("/users")
    public ResponseEntity<Map<Integer,UserEntity>> getUsers(){
        return ResponseEntity.ok(userDb);
    }



    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody UserEntity userEntity){
       if(userDb.containsKey(userEntity.getId())){
           return ResponseEntity.status(HttpStatus.CONFLICT).body("user already existed");
       }
       userDb.put(userEntity.getId(),userEntity);
       return ResponseEntity.status(HttpStatus.CREATED).body("created");
    }


    @PatchMapping("/user/{id}")
    public ResponseEntity<String> updateUser(@PathVariable int id,@RequestBody UserEntity userEntity){
        if(!userDb.containsKey(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not there");
        }
        userDb.put(userEntity.getId(),userEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body("updated");
    }


    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable int id){
        if(!userDb.containsKey(id)){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not there");
        }
        userDb.remove(id);
        return ResponseEntity.ok("deleted");
    }

}
