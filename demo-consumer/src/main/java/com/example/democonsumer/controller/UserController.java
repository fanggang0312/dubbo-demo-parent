package com.example.democonsumer.controller;

import com.example.demoservice.model.User;
import com.example.demoservice.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference //该注解是dubbo提供的
    private UserService userService;

    @GetMapping("/say/{word}")
    public String sayWord(@PathVariable String word) {
        return userService.sayHello(word);
    }

    @GetMapping("/saveUser")
    public String save() {
        User user = new User();
        user.setName("admin");
        user.setAge(22);
        return userService.save(user);
    }
}
