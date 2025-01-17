package com.sample.security.auth;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;
}
