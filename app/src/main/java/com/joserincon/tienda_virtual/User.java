package com.joserincon.tienda_virtual;

public class User {

    public User() {
    }

    public User(String name, String email, String password, String urlImageProfile, String phone) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.urlImageProfile = urlImageProfile;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrlImageProfile() {
        return urlImageProfile;
    }

    public void setUrlImageProfile(String urlImageProfile) {
        this.urlImageProfile = urlImageProfile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name;

    private String email;

    private String password;

    private String urlImageProfile;

    private String phone;

}
