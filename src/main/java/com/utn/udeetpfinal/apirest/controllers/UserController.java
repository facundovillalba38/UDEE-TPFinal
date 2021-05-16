package com.utn.udeetpfinal.apirest.controllers;

import com.utn.udeetpfinal.apirest.models.User;
import com.utn.udeetpfinal.apirest.services.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public List<User> index(){
        return userService.findAll();
    }



}
