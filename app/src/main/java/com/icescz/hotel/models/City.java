package com.icescz.hotel.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mvaldez on 07/02/2017.
 */

public class City extends RealmObject {
    @PrimaryKey
    private Integer Id;
    private String Name;
    private Province provinces;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Province getProvinces() {
        return provinces;
    }

    public void setProvinces(Province provinces) {
        this.provinces = provinces;
    }
}
