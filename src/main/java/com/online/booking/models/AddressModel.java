package com.online.booking.models;

import com.online.booking.enums.AddressType;
import jakarta.persistence.*;

@Entity
@Table(name ="addresses")
public class AddressModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int addressId;
    private String line_1;
    private String line_2;
    private String city;

    private int pincode;
    private String state;
    private String country;
    private boolean save;

    @Enumerated(EnumType.STRING)
    private AddressType Type;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserModel user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id",referencedColumnName = "locationID")
    private LocationModel location;
    // SELECT user.address from user JOIN address ON user.userID=address.user
    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public void setType(AddressType TYPE) {
        this.Type = TYPE;
    }
    public AddressType getType() {
        return Type;
    }
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getLine_1() {
        return line_1;
    }

    public void setLine_1(String line_1) {
        this.line_1 = line_1;
    }

    public String getLine_2() {
        return line_2;
    }

    public void setLine_2(String line_2) {
        this.line_2 = line_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isSave() {
        return save;
    }

    public void setSave(boolean save) {
        this.save = save;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }
}
