package com.task.eta.Validation;

import com.task.eta.DTO.LoginDTO;
import com.task.eta.DTO.TransactionDTO;
import com.task.eta.Exception.CommonException;
import com.task.eta.Exception.LoginPasswordException;
import com.task.eta.Exception.UserNotFoundException;
import com.task.eta.entity.TransactionEntity;
import com.task.eta.entity.UserEntity;
import com.task.eta.repository.TransactionRepo;
import com.task.eta.repository.UserRepo;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Validations {

    @Autowired
    UserRepo userRepo;

    @Autowired
    TransactionRepo transactionRepo;

    public boolean checkExistEmail(String email) {
        boolean userFlag = false;

        Integer id = userRepo.checkUser(email);
        if (id != null && id > 0)
            userFlag = true;

        return userFlag;
    }

    public boolean loginValidation(@NotNull LoginDTO loginDTO) throws CommonException {

        if (checkExistEmail(loginDTO.getEmail())) {
            UserEntity userEntity = userRepo.loginUser(loginDTO.getEmail());
            if (userEntity.getPassword().equals(loginDTO.getPassword())) {
                return true;
            } else {
                throw new LoginPasswordException("Password Mismatched");
            }

        } else
            throw new UserNotFoundException("Given email not exists");

    }


    public void UserIdValidation(Integer userId) throws CommonException {
        if(userId!=null){
            Optional<UserEntity> userEntity = userRepo.findById(userId);
            if(userEntity.isEmpty()){
                throw new UserNotFoundException("This user is not found");
            }
        }
    }
}
