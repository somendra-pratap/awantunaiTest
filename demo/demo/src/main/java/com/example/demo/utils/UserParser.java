package com.example.demo.utils;

import com.example.demo.data.entity.UserEntity;
import com.example.demo.model.User;

public class UserParser {

    public UserEntity convertUserToEntity(User user){
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(user.getAge());
        userEntity.setAddress(user.getAddress());
        userEntity.setEmail(user.getEmail());
        userEntity.setName(user.getName());
        userEntity.setPhoneNumber(user.getPhoneNumber());
        return userEntity;
    }
}
