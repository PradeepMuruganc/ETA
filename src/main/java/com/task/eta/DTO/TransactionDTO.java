package com.task.eta.DTO;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TransactionDTO {

    @NotNull(message = "Enter User id")
    private Integer userId;

    @NotNull(message = "Enter the message type")
    private String transactionType;

    @NotNull(message="Enter the amount")
    @Pattern(regexp = "^[+-]?(\\d+\\.?\\d*|\\.\\d+)$",message = "Enter the appropriate value")
    private double amount;

//    @Column(name="balance",nullable = false)
//    private double balance;

}
