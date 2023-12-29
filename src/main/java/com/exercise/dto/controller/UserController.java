package com.exercise.dto.controller;

import com.exercise.dto.dto.UserLocationDTO;
import com.exercise.dto.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping(path = "/all")
    public List<UserLocationDTO> getAllUsers(){
        return this.userService.getAllusersLocation();
    }
}
