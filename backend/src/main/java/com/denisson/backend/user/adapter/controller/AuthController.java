package com.denisson.backend.user.adapter.controller;

import com.denisson.backend.user.adapter.dtos.LoginDTO;
import com.denisson.backend.user.adapter.dtos.UserDTO;
import com.denisson.backend.user.core.domain.entities.User;
import com.denisson.backend.user.core.useCase.AuthenticateUser;
import com.denisson.backend.user.core.useCase.RegisterUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final AuthenticateUser authenticateUser;
    private final RegisterUser registerUser;

    public AuthController(AuthenticateUser authenticateUser, RegisterUser registerUser) {
        this.authenticateUser = authenticateUser;
        this.registerUser = registerUser;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO loginDTO) {
        String token = authenticateUser.authenticate(loginDTO);
        return ResponseEntity.ok(token);
    }

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody UserDTO userDTO) {
        User user = registerUser.register(userDTO);
        return ResponseEntity.ok(user);
    }
}
