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
@Getter
@Setter
@Entity
@Table(name="tbl_user")
public class UserEntity {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "email",nullable = false)
    private String email;

    @Column(name = "pword",nullable = false)
    private String password;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status",nullable = false)
    private Status status;

    @Column(name = "created_by",nullable = false)
    private String created_by;

    @Column(name = "updated_by",nullable = false)
    private String updated_by;

    @UpdateTimestamp
    @Column(name = "updated_date",nullable = false)
    private Timestamp updated_date;

    @CreationTimestamp
    @Column(name = "created_date",nullable = false)
    private Timestamp created_date;



//    @Override
//    public String toString() {
//        return "userEntity{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", status='" + status + '\'' +
//                ", created_by='" + created_by + '\'' +
//                ", updated_by='" + updated_by + '\'' +
//                ", updated_date='" + updated_date + '\'' +
//                ", created_date='" + created_date + '\'' +
//                '}';
//    }
}
