package com.example.User_Man.Model;

public class User {

    private int user_id;
    private String name;
    private String username;
    private String address;
    private String ph_number;

    public User(int user_id, String name, String username, String address, String ph_number) {
        this.user_id = user_id;
        this.name = name;
        this.username = username;
        this.address = address;
        this.ph_number = ph_number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPh_number() {
        return ph_number;
    }

    public void setPh_number(String ph_number) {
        this.ph_number = ph_number;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", ph_number='" + ph_number + '\'' +
                '}';
    }
}
