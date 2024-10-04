package com.denisson.backend.user.core.useCase;

import com.denisson.backend.user.adapter.dtos.LoginDTO;
import com.denisson.backend.user.adapter.repository.UserRepository;
import com.denisson.backend.user.infra.JwtService;
import com.denisson.backend.user.core.domain.entities.User;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticateUser {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthenticateUser(UserRepository userRepository, JwtService jwtService, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.passwordEncoder = passwordEncoder;
    }

    public String authenticate(LoginDTO loginDTO) {
        User user = userRepository.findByLogin(loginDTO.getLogin())
                .orElseThrow(() -> new UsernameNotFoundException("Invalid login"));

        if (!passwordEncoder.matches(loginDTO.getPassword(), user.getPassword())) {
            throw new BadCredentialsException("Invalid password");
        }

        return jwtService.generateToken(user);
    }
}
