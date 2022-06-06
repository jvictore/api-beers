package com.logicalis.la.demo.controller;

import com.logicalis.la.demo.model.beer.BeerModel;
import com.logicalis.la.demo.model.user.UserModel;
import com.logicalis.la.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<UserModel> getUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/one")
    public ResponseEntity<UserModel> getUserByLogin(@RequestBody UserModel body){
        UserModel founded = userService.getUserByLogin(body);
        return ResponseEntity.status(HttpStatus.OK).body(founded);
    }

    @PostMapping("/add")
    public ResponseEntity<UserModel> addUser(@RequestBody UserModel body){
        UserModel added = userService.addUser(body);
        return ResponseEntity.status(HttpStatus.OK).body(added);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<UserModel> removeUser(@RequestBody UserModel body){
        UserModel deleted = userService.removeUser(body);
        return ResponseEntity.status(HttpStatus.OK).body(deleted);
    }

}
