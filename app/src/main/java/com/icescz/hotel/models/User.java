package com.icescz.hotel.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mvaldez on 07/02/2017.
 */

public class User extends RealmObject {
    @PrimaryKey
    private Integer Id;
    private String Username;
    private String Password;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
