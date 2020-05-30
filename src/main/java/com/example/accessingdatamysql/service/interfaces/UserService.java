package com.example.accessingdatamysql.service.interfaces;

import com.example.accessingdatamysql.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User addUser(User u);
}
