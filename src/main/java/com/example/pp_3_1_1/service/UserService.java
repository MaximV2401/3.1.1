package com.example.pp_3_1_1.service;

import com.example.pp_3_1_1.model.User;
import com.example.pp_3_1_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<User> listUsers() {
        return userRepository.findAll();
    }


    public void add(User user) {
        userRepository.save(user);
    }




    public User getUser(long id) {
        return userRepository.getReferenceById(id);
    }



    public void delete(long id) {
        userRepository.deleteById(id);
    }


    public void update(User user) {
        userRepository.save(user);
    }
}
