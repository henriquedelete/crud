package com.chos.crud.services;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.chos.crud.models.UserModel;
import com.chos.crud.repositories.UserRepository;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }
}
