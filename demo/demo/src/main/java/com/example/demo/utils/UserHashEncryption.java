package com.example.demo.utils;

import com.example.demo.model.User;
import lombok.NonNull;
import org.springframework.util.StringUtils;

public class UserHashEncryption {

    public String getEncryptedPassword(@NonNull User user){
        if(StringUtils.hasText(user.getName()) && StringUtils.hasText(user.getAge().toString())){
            String userFirstName = user.getName().split(" ")[0].trim();
            return userFirstName.substring(userFirstName.length()/2)+user.getAge();
        }
        throw new IllegalArgumentException("Invalid User");
    }
}
