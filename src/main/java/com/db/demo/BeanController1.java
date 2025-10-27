package com.db.demo;


import org.springframework.stereotype.Component;

@Component
public class BeanController1 {
    private final MyBean1 myBean1;

    BeanController1(MyBean1 myBean1){
        this.myBean1 = myBean1;
    }
    public void display(){
        myBean1.displayBean();
    }
}
