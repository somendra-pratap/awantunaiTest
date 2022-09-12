package com.example.demo.service;

import com.example.demo.data.entity.UserEntity;
import com.example.demo.data.repository.UserRepository;
import com.example.demo.model.User;
import com.example.demo.utils.UserHashEncryption;
import com.example.demo.utils.UserParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

public class UserServiceImpl implements  UserService{

    @Autowired
    UserParser userParser;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserHashEncryption userHashEncryption;


    @Override
    public boolean addUser(User user) {
        if(isValidUser(user)){

        }

        UserEntity  userEntity = userParser.convertUserToEntity(user);



        userRepository.saveUser(userEntity);

        return false;
    }

    private boolean isValidUser(User user){
        if(StringUtils.hasText(user.getName()))

        return false;
    }
}
