package com.task.eta.service.impl;

import com.task.eta.DTO.TransactionDTO;
import com.task.eta.Validation.Validations;
import com.task.eta.entity.TransactionEntity;
import com.task.eta.mapper.TransactionMapper;
import com.task.eta.repository.TransactionRepo;
import com.task.eta.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionIMPL implements TransactionService
{
    @Autowired
    TransactionMapper transactionMapper;

    @Autowired
    Validations validations;

    @Autowired
    TransactionRepo transactionRepo;

    @Override
    public Integer createTransaction(TransactionDTO transactionDTO) throws Exception {
        validations.UserIdValidation(transactionDTO.getUserId());
        TransactionEntity transactionEntity = transactionMapper.transactionModelToEntity(transactionDTO);
        transactionEntity = transactionRepo.save(transactionEntity);
        return transactionEntity.getId();


    }}
