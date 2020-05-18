package com.amazon.marche.Utils;

import com.amazon.marche.dto.UserDTO;
import com.amazon.marche.model.User;
import org.modelmapper.ModelMapper;

public class AppUtils {

    public static UserDTO convert(User user){
        ModelMapper modelMapper = new ModelMapper();
        UserDTO userDTO = new UserDTO();
        modelMapper.map(user, userDTO);
        return userDTO;
    }

    public static User convert(UserDTO userDTO){
        ModelMapper modelMapper = new ModelMapper();
        User user = new User();
        modelMapper.map(userDTO, user);
        return user;
    }
}
