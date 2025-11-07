package com.db.demo.Service;


import com.db.demo.Entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService{
    private final Map<Integer, UserEntity> userDB = new HashMap<>();

    public Map<Integer,UserEntity> getAllUsers(){
        return userDB;
    }

    public String createUser(UserEntity userEntity){
        if(userDB.containsKey(userEntity.getId())){
            return "user already existed";
        }else{
            userDB.put(userEntity.getId(),userEntity);
        }
        return "user created";
    }
}
