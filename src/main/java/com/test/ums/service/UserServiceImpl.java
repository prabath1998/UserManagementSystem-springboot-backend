package com.test.ums.service;

import com.test.ums.entity.UserEntity;
import com.test.ums.model.User;
import com.test.ums.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user,userEntity);
        userRepository.save(userEntity);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> userEntities = userRepository.findAll();
        return null;
    }
}
