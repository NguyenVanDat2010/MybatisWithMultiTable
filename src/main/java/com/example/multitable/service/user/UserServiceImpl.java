package com.example.multitable.service.user;

import com.example.multitable.mapper.UserMapper;
import com.example.multitable.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nvdat2
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserWithAccount(Long id) {
        return userMapper.getUserWithAccount(id);
    }

    @Override
    public User getUserWithCompany(Long id) {
        return userMapper.getUserWithCompany(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.getAllUsers();
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int insert(User user) {
        return 0;
    }
}
