package com.task.eta.service.impl;

import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.UserCreationException;
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

    public boolean checkExistEmail(String email) {
        boolean userFlag = false;

        Integer id = userRepo.checkUser(email);
        if (id != null) {
            userFlag = true;

        }
        return userFlag;
    }

    @Override
    public Integer adduser(UserDTO userDTO) throws UserCreationException{
        UserEntity userEntity = UserMapper.userModelToEntity(userDTO);
        if (checkExistEmail(userDTO.getEmail())) {
            throw new UserCreationException("User already exist. Try with other email !");
        } else {
            userEntity = userRepo.save(userEntity);
            return userEntity.getId();
        }
    }
}
