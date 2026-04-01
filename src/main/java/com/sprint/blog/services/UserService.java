package com.sprint.blog.services;

import com.sprint.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
