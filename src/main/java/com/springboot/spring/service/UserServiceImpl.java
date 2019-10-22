package com.springboot.spring.service;

import com.springboot.spring.data.User;
import com.springboot.spring.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRep rep;

    @Override
    public List<User> print() {
        List<User> user = rep.getUser();
        if(user != null)
            return user;
        return null;
    }
//    @Override
//    public User print() {
//        User list = rep.getUser();
//        return list;
//    }
}
