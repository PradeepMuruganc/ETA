package com.task.eta.mapper;

import com.task.eta.DTO.TransactionDTO;
import com.task.eta.Enum.Status;
import com.task.eta.entity.TransactionEntity;
import com.task.eta.entity.UserEntity;
import com.task.eta.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TransactionMapper {

    @Autowired
    UserRepo userRepo;
    public TransactionEntity transactionModelToEntity(TransactionDTO transactionDTO) {
        TransactionEntity transactionEntity = new TransactionEntity();
        Optional<UserEntity> userRecord = userRepo.findById(transactionDTO.getUserId());
        UserEntity userDTO = userRecord.get();
        transactionEntity.setUserId(userDTO.getId());
        transactionEntity.setTransactionType(transactionDTO.getTransactionType());
        transactionEntity.setAmount(Double.parseDouble(String.valueOf(transactionDTO.getAmount())));
        transactionEntity.setStatus(Status.ACTIVE);
        transactionEntity.setCreated_by(userDTO.getUsername());
        transactionEntity.setUpdated_by(userDTO.getUsername());

        return transactionEntity;
    }
}
