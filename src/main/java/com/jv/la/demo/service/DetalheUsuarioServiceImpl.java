package com.jv.la.demo.service;

import com.jv.la.demo.data.DetalheUsuarioData;
import com.jv.la.demo.model.user.UserModel;
import com.jv.la.demo.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DetalheUsuarioServiceImpl implements UserDetailsService {
    private final UserRepository repository;

    public DetalheUsuarioServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<UserModel> usuario = repository.findByLogin(username);
        if (!usuario.isPresent()){
            throw new UsernameNotFoundException("Usuario [" + username + "] não encontrado");
        }
        return new DetalheUsuarioData(usuario);
    }
}
