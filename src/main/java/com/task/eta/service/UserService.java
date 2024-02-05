package com.task.eta.service;

import com.task.eta.DTO.LoginDTO;
import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.CommonException;
import com.task.eta.Exception.LoginException;
import com.task.eta.Exception.LoginPasswordException;
import com.task.eta.Exception.UserCreationException;
import org.springframework.stereotype.Service;

@Service

public interface UserService {

    Integer adduser(UserDTO userDTO)throws UserCreationException;



    String loginUser(LoginDTO loginDTO) throws CommonException;
}
