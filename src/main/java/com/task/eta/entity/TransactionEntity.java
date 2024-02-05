package com.task.eta.entity;

import com.task.eta.Enum.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="tbl_transaction")
public class TransactionEntity {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(name="user_id", nullable = false)
    private Integer userId;

    @Column(name="transaction_type", nullable = false, length =50)
    private String transactionType;

    @Column(name="amount",nullable = false)
    private double amount   ;

    @Column(name="balance")
    private double balance;


    @CreationTimestamp
    @Column(name = "transaction_date",nullable = false)
    private Timestamp transaction_date;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @Column(name = "created_by")
    private String created_by;

    @Column(name = "updated_by")
    private String updated_by;

    @UpdateTimestamp
    @Column(name = "updated_date")
    private Timestamp updated_date;

    @CreationTimestamp
    @Column(name = "created_date")
    private Timestamp created_date;

}
