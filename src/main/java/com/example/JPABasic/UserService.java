package com.example.JPABasic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public String addUser(User user) {
        userRepository.save(user);
        return "User Added";
    }

    public User getById(Integer id) {
        return userRepository.findById(id).get();
    }

    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    public String deleteAllUser() {
        userRepository.deleteAll();
        return "All Users are Deleted";
    }

    public String deleteUserById(Integer id) {
        userRepository.deleteById(id);
        return "User Deleted";
    }

    public void updateNameWithId(Integer id, String name) {
        User user = userRepository.findById(id).get();
        user.setName(name);
        userRepository.save(user);
    }
}
