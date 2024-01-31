package com.task.eta.service;

import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.UserCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public interface UserService {

    Integer adduser(UserDTO userDTO)throws UserCreationException;
}
