package com.dambrz.ecommercbookstoreapi.service;

import com.dambrz.ecommercbookstoreapi.model.User;
import com.dambrz.ecommercbookstoreapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getListOfUsers() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public User deleteUser(long id) {
        User user = userRepository.getById(id);
        userRepository.delete(user);
        return user;
    }
}
