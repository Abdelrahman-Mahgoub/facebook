package com.example.demo11;

import com.google.gson.annotations.Expose;

import java.time.LocalDate;
import java.util.UUID;

public class User {
    @Expose
    private  String userId; // Gson will now handle this field
    @Expose
    private  String email;
    @Expose
    private  String username;
    @Expose
    private  String password;
    @Expose
    private  LocalDate dateOfBirth;
    private String status;


    public void setStatus(String status) {
        this.status = status;
    }

    public User(String email, String username, String password, LocalDate dateOfBirth) {
        this.email = email;
        this.userId= UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.status = "offline";
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStatus() {
        return status;
    }
}
