package com.example.accessingdatamysql.controller;

import com.example.accessingdatamysql.entity.User;
import com.example.accessingdatamysql.service.interfaces.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String firstName,
                                            @RequestParam String lastName,
                                            @RequestParam String address,
                                            @RequestParam String phoneNumber,
                                            @RequestParam String email) {
        StringBuilder errorString = new StringBuilder();
        if(firstName == null || firstName.isEmpty()) {
            errorString.append("First name field cannot be empty ");
        }
        if(lastName == null || lastName.isEmpty()) {
            errorString.append("Last name field cannot be empty ");
        }
        if(address == null || address.isEmpty()) {
            errorString.append("Address field cannot be empty ");
        }
        if(phoneNumber == null || phoneNumber.isEmpty()) {
            errorString.append("Phone number field cannot be empty ");
        }
        if(email == null || email.isEmpty()) {
            errorString.append("Email field cannot be empty ");
        }
        if(errorString.length() > 0) {
            throw new IllegalArgumentException(errorString.toString());
        }
        User newUser = new User();
        newUser.setFirstName(firstName);
        newUser.setLastName(lastName);
        newUser.setAddress(address);
        newUser.setPhoneNumber(phoneNumber);
        newUser.setEmail(email);
        userService.addUser(newUser);
        return "Saved";
    }

    @GetMapping("/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
