package com.task.eta.DTO;

import com.task.eta.Enum.Status;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Component
public class UserDTO {
//    @NotBlank
    private int id;

    @NotBlank(message = "Please enter the Username!")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$",message = "Special characters not allowed !")
    @Size(min = 3,max = 20,message = "Your username size should be between 3 and 20 and should not have special characters!")
    private String username;
    @NotBlank(message = "Please enter the email!")
    @Email(message = "Inappropriate email!")
    private String email;
    @NotBlank(message = "Please enter the Password!")
    @Size(min = 8,max = 20,message = "Your password size should be between 8 and 20!")
    private String password;

    private Status status;

    private String createdBy;

    private String updatedBy;
    private Timestamp createdDate;
    private Timestamp updatedDate;

}

