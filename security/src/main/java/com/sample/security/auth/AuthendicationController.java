package com.sample.security.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthendicationController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthendicationResponse> register(@RequestBody RegisterRequest request){

        return ResponseEntity.ok(authService.register(request));
    }
    @PostMapping("/authendicate")
    public ResponseEntity<AuthendicationResponse> register(@RequestBody AuthendicationRequest request){

        return ResponseEntity.ok(authService.authendicate(request));
    }


}
