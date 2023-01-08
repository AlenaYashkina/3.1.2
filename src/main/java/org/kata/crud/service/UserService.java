package org.kata.crud.service;

import org.kata.crud.model.User;
import org.kata.crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Object getAllUsers() {
        return userRepository.findAll();
    }

    public Object getUser(Long id) {
        return userRepository.getOne(id);
    }

    public User createOrUpdateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
