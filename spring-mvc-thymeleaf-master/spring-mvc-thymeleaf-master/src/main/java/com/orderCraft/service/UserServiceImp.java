package com.orderCraft.service;

import com.orderCraft.entity.User;
import com.orderCraft.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp {

    @Autowired
    private UserRepository userRepository;

    public User getUser(Long idUser) {
        return userRepository.findById(idUser).get();
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public void delete(Long idUser) {
         userRepository.deleteById(idUser);
    }

}