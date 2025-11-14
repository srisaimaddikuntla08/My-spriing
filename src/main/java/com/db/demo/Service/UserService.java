package com.db.demo.Service;

import com.db.demo.Model.UserModel;
import com.db.demo.Repositary.UserRepositary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepositary userRepositary;
    public UserService(UserRepositary userRepositary){
        this.userRepositary= userRepositary;
    }

    public List<UserModel> getAllUsers(){
        return userRepositary.findAll();
    }

    public String createUser(UserModel userModel){
        userRepositary.save(userModel);
        return "user created";
    }


}
