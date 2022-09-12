package com.example.demo.data.repository;


import com.example.demo.data.entity.UserEntity;

public interface UserRepository{
    UserEntity saveUser(UserEntity userEntity);

    UserEntity findUserByEmail(UserEntity userEntity);

}
