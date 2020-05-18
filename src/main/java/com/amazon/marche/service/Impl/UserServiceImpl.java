package com.amazon.marche.service.Impl;

import com.amazon.marche.Utils.AppUtils;
import com.amazon.marche.dto.UserDTO;
import com.amazon.marche.model.User;
import com.amazon.marche.repository.UserRepository;
import com.amazon.marche.service.GenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements GenericService<User> {

    @Autowired
    private UserRepository repository;

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public List<User> getAll() {
        List<UserDTO> userDTOS = repository.findAll();
        List<User> users = new ArrayList<>();
        for(UserDTO user: userDTOS){
            users.add(AppUtils.convert(user));
        }
        return users;
    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public int delete(int id) {
        return 0;
    }
}
