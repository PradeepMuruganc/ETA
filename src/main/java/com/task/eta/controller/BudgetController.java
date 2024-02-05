package com.task.eta.controller;

import com.task.eta.DTO.UserDTO;
import com.task.eta.Exception.UserCreationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RestController
@RequestMapping("/budget")
public class BudgetController {
    @PostMapping(path = "/create")
    public ResponseEntity<String> createBudget()  {
        return ResponseEntity.ok("Budget created");
    }

    @PutMapping(path = "/update")
    public ResponseEntity<String> updateBudget()  {
        return ResponseEntity.ok("Budget updated");}
}
