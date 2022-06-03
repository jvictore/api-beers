package com.logicalis.la.demo.repository;
import com.logicalis.la.demo.model.user.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserModel, Integer>{
    UserModel findByUsername(String username);
    UserModel deleteByUsername(String username);
    UserModel getByEmail(String email);
}
