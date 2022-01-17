package com.spring.airport.Dao;


import com.spring.airport.POJO.LoginPage;

public interface userdao {
    void register(LoginPage login) ;



    LoginPage validateUser(LoginPage login);
}
