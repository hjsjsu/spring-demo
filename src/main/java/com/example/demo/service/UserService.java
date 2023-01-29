package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll () {
        return userMapper.list();
    }

    public User findOne (Integer id) {
        return userMapper.detail(id);
    }

    public boolean update (User user) {
        if ((user.getId() + "").equals("")) {
            return false;
        }
        return userMapper.update(user);
    }

    public boolean submit(User user) {
        if (user == null) {
            return false;
        }
        return userMapper.submit(user);
    }

    public boolean removeById(Integer id) {
        if (id == null) return false;
        return userMapper.remove(id);
    }

}
