package com.icescz.hotel.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mvaldez on 07/02/2017.
 */

public class City extends RealmObject {
    @PrimaryKey
    private Long Id;
    private String Name;
    private Province Province;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public com.icescz.hotel.models.Province getProvince() {
        return Province;
    }

    public void setProvince(com.icescz.hotel.models.Province province) {
        Province = province;
    }
}
