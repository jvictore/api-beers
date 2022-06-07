package com.logicalis.la.demo.model.user;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
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
    private int _id;
    @Indexed(unique=true)
    private String login;
    private String password;

    public UserModel(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void setId(int id) {
        this._id = id;
    }
    @javax.persistence.Id
    public int getId() {
        return _id;
    }
}
