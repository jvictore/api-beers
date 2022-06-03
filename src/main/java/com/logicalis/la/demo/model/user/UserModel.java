package com.logicalis.la.demo.model.user;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import javax.persistence.UniqueConstraint;

@Data
@Document
public class UserModel {
    @Indexed(unique=true)
    private String username;
    private String password;
    private String email;

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
