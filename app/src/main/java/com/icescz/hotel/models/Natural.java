package com.icescz.hotel.models;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mvaldez on 07/02/2017.
 */

public class Natural extends RealmObject {
    @PrimaryKey
    private Long Id;
    private Department Department;
    private Province Province;
    private City City;
    private Country Country;
    private Integer CI;
    private String FullName;
    private String Profesion;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public com.icescz.hotel.models.Department getDepartment() {
        return Department;
    }

    public void setDepartment(com.icescz.hotel.models.Department department) {
        Department = department;
    }

    public com.icescz.hotel.models.Province getProvince() {
        return Province;
    }

    public void setProvince(com.icescz.hotel.models.Province province) {
        Province = province;
    }

    public com.icescz.hotel.models.City getCity() {
        return City;
    }

    public void setCity(com.icescz.hotel.models.City city) {
        City = city;
    }

    public com.icescz.hotel.models.Country getCountry() {
        return Country;
    }

    public void setCountry(com.icescz.hotel.models.Country country) {
        Country = country;
    }

    public Integer getCI() {
        return CI;
    }

    public void setCI(Integer CI) {
        this.CI = CI;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getProfesion() {
        return Profesion;
    }

    public void setProfesion(String profesion) {
        Profesion = profesion;
    }
}
