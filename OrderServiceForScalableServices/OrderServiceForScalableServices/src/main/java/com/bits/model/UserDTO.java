package com.bits.model;


public class UserDTO {

    private String userName;

    private String pincode;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public UserDTO(String userName, String pincode) {
        this.userName = userName;
        this.pincode = pincode;
    }
    public UserDTO(){}

    @Override
    public String toString() {
        return "UserDTO{" +
                "userName='" + userName + '\'' +
                ", pincode='" + pincode + '\'' +
                '}';
    }
}
