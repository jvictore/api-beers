package com.logicalis.la.demo.service;

import com.logicalis.la.demo.model.user.UserModel;
import com.logicalis.la.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public UserModel getUserByUsername(UserModel body){
        String username = body.getUsername();
        return userRepository.findByUsername(username);
    }

    public UserModel addUser(UserModel body){
        return userRepository.save(body);
    }

    public UserModel removeUser(UserModel body){
        String username = body.getUsername();
        return userRepository.deleteByUsername(username);
    }

    public UserModel getByEmail(String email) {
        return userRepository.getByEmail(email);
    }
}
