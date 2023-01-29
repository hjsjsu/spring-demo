package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> list();
    User detail(int id);
    boolean update(User user);
    boolean submit(User user);
    boolean remove(int id);

}
