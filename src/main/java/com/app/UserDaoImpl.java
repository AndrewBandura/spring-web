package com.app;


import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
    public UserDaoImpl() {
    }

    public String getName() {
        return "Bill Gates";
    }
}
