package com.project.MusicStore.service.impl;

import com.project.MusicStore.persistence.model.User;
import com.project.MusicStore.persistence.repository.UserRepository;
import com.project.MusicStore.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User create(User newUser) {
        return userRepository.save(newUser);
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByEmail(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }

}
