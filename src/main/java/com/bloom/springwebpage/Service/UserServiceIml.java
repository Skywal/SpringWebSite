package com.bloom.springwebpage.Service;

import com.bloom.springwebpage.DAO.UserDAO;
import com.bloom.springwebpage.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceIml implements UserService {

    /**
     * це діло підгружено ззовні
     */
    @Autowired
    public UserDAO userDAO;

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
