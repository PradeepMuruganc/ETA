package com.task.eta.DTO;

import com.task.eta.Enum.Status;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    @NotBlank(message = "Please enter the Username!")
    @Pattern(regexp = "^[a-zA-Z0-9_]+$",message = "Special characters not allowed !")
    @Size(min = 3,max = 20,message = "Your username size should be between 3 and 20 and should not have special characters!")
    private String username;
    @NotBlank(message = "Please enter the email!")
    @Pattern(regexp = "^(.+)+@(.+)$", message = "Inappropriate email!")
    private String email;
    @NotBlank(message = "Please enter the Password!")
    @Size(min = 8,max = 20,message = "Your password size should be between 8 and 20!")
    private String password;

    private Status status;

    private String created_by;

    private String updated_by;
    private Timestamp created_date;
    private Timestamp updated_date;

//    @Override
//    public String toString() {
//        return "UserDTO{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", status='" + status + '\'' +
//                ", created_by='" + created_by + '\'' +
//                ", updated_by='" + updated_by + '\'' +
//                ", created_date=" + created_date +
//                ", updated_date=" + updated_date +
//                '}';
//    }
}
