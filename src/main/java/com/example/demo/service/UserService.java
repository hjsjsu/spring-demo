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
    public String update (User user) {
        if ((user.getId() + "").equals("")) {
            return "传入id为空";
        }
        if (findOne(user.getId()) == null) {
            return "没有查询到该用户";
        }
        boolean update = userMapper.update(user);
        if (update) {
            return "操作成功";
        }
        return "操作失败";
    }
    public String submit(User user) {
        if (user == null) {
            return "传入参数有误";
        }
        boolean submit = userMapper.submit(user);
        if (submit) {
            return "操作成功";
        }
        return "操作失败";
    }
    public String removeById(Integer id) {
        if (id == null) return "传入id为空";
        boolean remove = userMapper.remove(id);
        if (remove) {
            return "删除成功";
        }
        return "删除失败";
    }

}
