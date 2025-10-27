package com.db.demo.UsreEntity;


import org.springframework.stereotype.Component;

@Component
public class UserEntity {
    private int id;
    private String email;

    public UserEntity(){};

    public UserEntity(int id,String email){
        this.id = id;
        this.email = email;
    }

    public UserEntity(int id) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
