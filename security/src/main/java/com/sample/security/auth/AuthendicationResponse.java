package com.sample.security.auth;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthendicationResponse {

    private String token;
}
