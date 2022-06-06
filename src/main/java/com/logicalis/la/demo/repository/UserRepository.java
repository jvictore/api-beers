package com.logicalis.la.demo.repository;
import com.logicalis.la.demo.model.user.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<UserModel, Integer>{
    Optional<UserModel> findByLogin(String login);
    UserModel deleteByLogin(String login);
}
