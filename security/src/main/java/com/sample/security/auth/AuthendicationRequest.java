package com.sample.security.auth;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthendicationRequest {
    private String email;
    private String password;
}
