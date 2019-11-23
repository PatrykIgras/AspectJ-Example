package com.example.aspectDemo.service;

import com.example.aspectDemo.aspects.Logging;
import com.example.aspectDemo.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class UserService {
    private User user;

    public UserService(User user) {
        this.user = user;
    }


    public void setUserName(String name) {
        user.setName(name);
    }


    public String getUserName() {
        return user.getName();
    }

    @Logging
    public String helloUser() {
        return "HELLO " + user.getName();
    }

    public void setBirthDate(LocalDate date){
        if (date.isAfter(LocalDate.now()) || date.isEqual(LocalDate.now())) {
            throw new IllegalArgumentException("Data jest nieprawidłowa");
        } else {
            user.setBirthDate(date);
        }
    }


}
