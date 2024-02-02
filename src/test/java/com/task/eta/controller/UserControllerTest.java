package com.task.eta.controller;

import com.task.eta.DTO.UserDTO;
import com.task.eta.Enum.Status;
import com.task.eta.Exception.UserCreationException;
import com.task.eta.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
 class UserControllerTest {
    @InjectMocks
     UserController userController;

    @Mock
    UserService userService;

    UserDTO userDTO = new UserDTO();

    @BeforeEach
    public void init(){
        userDTO.setUsername("Sam");
        userDTO.setEmail("sam@gmail.com");
        userDTO.setPassword("123");
        userDTO.setStatus(Status.ACTIVE);
    }

    @Test
     void registerUserTest() throws UserCreationException {
        when(userService.adduser(Mockito.any())).thenReturn(Mockito.anyInt());
        ResponseEntity<String> user =  userController.registerUser(userDTO);
        assertEquals(HttpStatus.CREATED,user.getStatusCode());



    }
}
