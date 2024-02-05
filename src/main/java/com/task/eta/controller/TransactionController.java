package com.task.eta.controller;

import com.task.eta.DTO.TransactionDTO;
import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.CommonException;
import com.task.eta.Exception.UserCreationException;
import com.task.eta.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;
    @PostMapping(path="/create")
    public ResponseEntity<String> createTask(@RequestBody @Valid TransactionDTO transactionDTO) throws Exception {
        Integer id = transactionService.createTransaction(transactionDTO);
        String responseMsg = "Successfully Registered!\nYour TransactionId: " + id;
        return new ResponseEntity<>(responseMsg, HttpStatus.CREATED);

//    @PutMapping(path = "/update")
//    public ResponseEntity<String> updateTransaction()  {
//        return ResponseEntity.ok("Transaction updated");}
//
//    @DeleteMapping(path = "/delete")
//    public ResponseEntity<String> deleteTransaction()  {
//        return ResponseEntity.ok("Transaction deleted");}
//
//
      /*  @GetMapping("/show")
        public ResponseEntity<List<TransactionDTO>> listTransaction(Integer userId) throws CommonException{
            return new ResponseEntity<>(transactionService.showList(userId),HttpStatus.OK);}*/
    }}
