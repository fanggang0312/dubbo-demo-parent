package com.example.demoservice.service;

import com.example.demoservice.model.User;

public interface UserService {

    String save(User user);

    String sayHello(String word);

}
