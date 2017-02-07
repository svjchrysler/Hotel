package com.icescz.hotel.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mvaldez on 07/02/2017.
 */

public class Country extends RealmObject {

    @PrimaryKey
    private Integer Id;
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
