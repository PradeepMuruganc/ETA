package com.task.eta.service.impl;

import com.task.eta.DTO.LoginDTO;
import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.CommonException;
import com.task.eta.Exception.LoginException;
import com.task.eta.Exception.LoginPasswordException;
import com.task.eta.Exception.UserCreationException;
import com.task.eta.Validation.Validations;
import com.task.eta.entity.UserEntity;
import com.task.eta.mapper.UserMapper;
import com.task.eta.repository.UserRepo;
import com.task.eta.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    Validations validation;

    @Autowired
    UserMapper userMapper;


    @Override
    public Integer adduser(UserDTO userDTO) throws UserCreationException {
        UserEntity userEntity = userMapper.userModelToEntity(userDTO);
        if (validation.checkExistEmail(userDTO.getEmail())) {
            throw new UserCreationException("User already exist. Try with other email !");
        }
      else {
            userEntity = userRepo.save(userEntity);
            return userEntity.getId();
        }
    }

    @Override
    public String loginUser(LoginDTO loginDTO) throws CommonException {

        if(validation.loginValidation(loginDTO)){
            return "Login successful";
        }
        return null;
    }
}
