package com.task.eta.mapper;

import com.task.eta.DTO.LoginDTO;
import com.task.eta.DTO.UserDTO;
import com.task.eta.Enum.Status;
import com.task.eta.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserEntity userModelToEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setUsername(userDTO.getUsername());
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setStatus(Status.ACTIVE);
        userEntity.setCreated_by(userDTO.getUsername());
        userEntity.setUpdated_by(userDTO.getUsername());
        userEntity.setCreated_date(userDTO.getCreatedDate());
        userEntity.setUpdated_date(userDTO.getUpdatedDate());
        return userEntity;

    }
    public static UserEntity loginModelToEntity(LoginDTO loginDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(loginDTO.getEmail());
        userEntity.setPassword(loginDTO.getPassword());
        userEntity.setStatus(Status.ACTIVE);
    return userEntity;}
}
