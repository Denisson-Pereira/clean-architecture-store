package com.denisson.backend.user.core.useCase;

import com.denisson.backend.user.adapter.dtos.UserDTO;
import com.denisson.backend.user.adapter.repository.UserRepository;
import com.denisson.backend.user.core.domain.entities.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class RegisterUser {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public RegisterUser(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(UserDTO userDTO) {
        if (userRepository.findByLogin(userDTO.getLogin()).isPresent()) {
            throw new IllegalArgumentException("Login already exists");
        }

        User user = new User();
        user.setName(userDTO.getName());
        user.setLogin(userDTO.getLogin());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword()));

        return userRepository.save(user);
    }
}
