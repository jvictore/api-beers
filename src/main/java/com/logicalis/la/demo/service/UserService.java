package com.logicalis.la.demo.service;

import com.logicalis.la.demo.model.user.UserModel;
import com.logicalis.la.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<UserModel> findByLogin(String login){
        return userRepository.findByLogin(login);
    }

    public UserModel addUser(UserModel body){
        return userRepository.save(body);
    }

    public UserModel removeUser(UserModel body){
        String login = body.getLogin();
        return userRepository.deleteByLogin(login);
    }
}
