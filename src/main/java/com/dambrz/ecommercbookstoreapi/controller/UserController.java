package com.dambrz.ecommercbookstoreapi.controller;

import com.dambrz.ecommercbookstoreapi.model.User;
import com.dambrz.ecommercbookstoreapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getListOfUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @DeleteMapping(path = { "/{id}" })
    public User deleteUser(@PathVariable("id") long id) {
        return userService.deleteUser(id);
    }
}
