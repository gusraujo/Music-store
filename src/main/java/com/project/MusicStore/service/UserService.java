package com.project.MusicStore.service;

import com.project.MusicStore.persistence.model.User;

public interface UserService {

    User create(User newUser);

    User getUserByUsername(String username);

}
