package com.jv.la.demo.controller;

import com.jv.la.demo.model.user.UserModel;
import com.jv.la.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import sun.security.util.Password;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final PasswordEncoder encoder;

    @GetMapping
    public ResponseEntity<List<UserModel>> getUser(){
        return ResponseEntity.status(HttpStatus.OK).body(userService.getAllUsers());
    }

    @GetMapping("/username")
    public ResponseEntity<Optional<UserModel>> getUserByUsername(@RequestBody UserModel body){
        String login = body.getLogin();
        Optional<UserModel> founded = userService.findByLogin(login);
        return ResponseEntity.status(HttpStatus.OK).body(founded);
    }

    @PostMapping("/add")
    public ResponseEntity<UserModel> addUser(@RequestBody UserModel body){
        body.setPassword(encoder.encode(body.getPassword()));
        UserModel added = userService.addUser(body);
        return ResponseEntity.status(HttpStatus.OK).body(added);
    }

    @GetMapping("/validarSenha")
    public ResponseEntity<Boolean> validarSenha(@RequestParam String login,
                                                @RequestParam String password) {
        Optional<UserModel> optUsuario = userService.findByLogin(login);
        if (!optUsuario.isPresent()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }

        UserModel usuario = optUsuario.get();
        boolean valid = encoder.matches(password, usuario.getPassword());

        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(valid);
    }

    @DeleteMapping("/remove")
    public ResponseEntity<UserModel> removeUser(@RequestBody UserModel body){
        UserModel deleted = userService.removeUser(body);
        return ResponseEntity.status(HttpStatus.OK).body(deleted);
    }

}
