package com.task.eta.mapper;

import com.task.eta.DTO.UserDTO;
import com.task.eta.Enum.Status;
import com.task.eta.entity.UserEntity;

public class UserMapper {

    public static UserEntity userModelToEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setStatus(Status.ACTIVE);
        userEntity.setCreated_by(userDTO.getUsername());
        userEntity.setUpdated_by(userDTO.getUsername());
        userEntity.setCreated_date(userDTO.getCreated_date());
        userEntity.setUpdated_date(userDTO.getUpdated_date());
        return userEntity;

    }
}
