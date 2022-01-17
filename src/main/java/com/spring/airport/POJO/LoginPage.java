package com.spring.airport.POJO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginPage {

    @NotBlank(message="Cannot be empty")
    @Size(min=4,max=10,message ="Should have a size between 4-10")
    private String username;

    @NotBlank(message="password Cannot be empty")
    @Size(min=4,max=10,message ="Should have a size between 4-10")
    private String password;
    private String usertype;

    public LoginPage() {
    }

    public LoginPage(String username, String password, String usertype) {
        this.username = username;
        this.password = password;
        this.usertype = usertype;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return this.usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
}


