package com.task.eta.service;

import com.task.eta.DTO.TransactionDTO;
import com.task.eta.Exception.CommonException;
import jakarta.validation.constraints.DecimalMax;

public interface TransactionService {
    Integer createTransaction(TransactionDTO transactionDTO) throws Exception;

//    DecimalMax.List<TransactionDTO> showList(Integer id) throws CommonException;
}
