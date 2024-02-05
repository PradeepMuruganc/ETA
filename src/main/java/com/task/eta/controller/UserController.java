package com.task.eta.controller;


import com.task.eta.DTO.LoginDTO;
import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.CommonException;
import com.task.eta.Exception.LoginException;
import com.task.eta.Exception.LoginPasswordException;
import com.task.eta.Exception.UserCreationException;
import com.task.eta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.http.HttpResponse;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/register")
    public ResponseEntity<String> registerUser(@RequestBody @Valid UserDTO userDTO) throws UserCreationException {
        Integer id= userService.adduser(userDTO);
        String responseMsg="Successfully Registered !\nYour UserId : " +id;
        return new ResponseEntity<>( responseMsg, HttpStatus.CREATED);
    }
    @PostMapping(path="/login")
    public ResponseEntity<String> loginUser(@RequestBody @Valid LoginDTO loginDTO) throws CommonException {
        return new ResponseEntity<>(userService.loginUser(loginDTO), HttpStatus.ACCEPTED);
    }}





