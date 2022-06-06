package com.logicalis.la.demo.model.user;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.Data;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="user")
public class UserModel {
    @Id
    private Long id;
    @Indexed(unique=true)
    private String login;
    private String password;

    public UserModel(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @javax.persistence.Id
    public Long getId() {
        return id;
    }
}
