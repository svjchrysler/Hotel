package com.icescz.hotel.controllers;

import com.icescz.hotel.models.User;

import io.realm.Realm;
import io.realm.RealmQuery;
import io.realm.RealmResults;

/**
 * Created by svjchrysler on 2/7/17.
 */

public class EntityUser {

    private Realm conexion() {
        return Realm.getDefaultInstance();
    }

    public void registerUser() {

        Realm realm = conexion();
        realm.beginTransaction();
        User user = realm.createObject(User.class, 1);
        user.setUsername("Nicol");
        user.setPassword("justiniano");
        realm.commitTransaction();

    }

    public RealmResults<User> getUsers() {
        Realm realm = conexion();
        RealmQuery<User> query =  realm.where(User.class);
        RealmResults<User> results = query.findAll();
        return results;

    }

}
