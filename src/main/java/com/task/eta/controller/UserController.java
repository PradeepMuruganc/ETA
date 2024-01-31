package com.task.eta.controller;


import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.UserCreationException;
import com.task.eta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.http.HttpResponse;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/register")
    public ResponseEntity<String> registerUser(@RequestBody @Valid UserDTO userDTO) throws UserCreationException {
        Integer id= userService.adduser(userDTO);
        String responseMsg="Successfully Registerd !\nYour UserId : " +id;
        return new ResponseEntity<>( responseMsg, HttpStatus.CREATED);
    }
}
