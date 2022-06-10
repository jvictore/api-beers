package com.logicalis.la.demo.model.user;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "user")
public class UserModel {
    @Indexed(unique=true)
    private String login;
    private String password;

    public UserModel(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
