package com.icescz.hotel.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by mvaldez on 07/02/2017.
 */

public class Hotel extends RealmObject {

    @PrimaryKey
    private Integer Id;
    private User User;
    private Department Department;
    private Province Province;
    private City City;
    private Guest Guest;
    private CategoryHotel CategoryHotel;
    private RealmList<Personal> Personals;
    private String BusinessName;
    private String Address;
    private String Phone;
    private String Fax;
    private String Email;
    private String WebSite;
    private String HotelChain;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public com.icescz.hotel.models.User getUser() {
        return User;
    }

    public void setUser(com.icescz.hotel.models.User user) {
        User = user;
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

    public com.icescz.hotel.models.Guest getGuest() {
        return Guest;
    }

    public void setGuest(com.icescz.hotel.models.Guest guest) {
        Guest = guest;
    }

    public com.icescz.hotel.models.CategoryHotel getCategoryHotel() {
        return CategoryHotel;
    }

    public void setCategoryHotel(com.icescz.hotel.models.CategoryHotel categoryHotel) {
        CategoryHotel = categoryHotel;
    }

    public String getBusinessName() {
        return BusinessName;
    }

    public void setBusinessName(String businessName) {
        BusinessName = businessName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getWebSite() {
        return WebSite;
    }

    public void setWebSite(String webSite) {
        WebSite = webSite;
    }

    public String getHotelChain() {
        return HotelChain;
    }

    public void setHotelChain(String hotelChain) {
        HotelChain = hotelChain;
    }
}
