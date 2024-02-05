package com.task.eta.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LoginDTO {
    @NotBlank(message = "Please enter the email!")
    @Pattern(regexp = "^(.+)+@(.+)$", message = "Enter your appropriate Email!")
    private String email;
    @NotBlank(message = "Please enter the Password!")
    private String password;
}
