package com.example.aspectDemo.models;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class User {
    private String name;
    private LocalDate birthDate;

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
