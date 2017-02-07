package com.icescz.hotel.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mvaldez on 07/02/2017.
 */

public class Legal extends RealmObject {
    @PrimaryKey
    private Integer Id;
    private String BusinessName;
    private Integer NIT;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String businessName) {
        BusinessName = businessName;
    }

    public Integer getNIT() {
        return NIT;
    }

    public void setNIT(Integer NIT) {
        this.NIT = NIT;
    }
}
