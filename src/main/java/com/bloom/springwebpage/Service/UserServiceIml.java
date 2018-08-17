package com.bloom.springwebpage.Service;

import com.bloom.springwebpage.DAO.UserDAO;
import com.bloom.springwebpage.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * це все виконується через рівень контролерів
 */
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

    @Override
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    public User getById(int id) {
        return userDAO.getById(id);
    }

    @Override
    public void delete(int id) {
        userDAO.delete(id);
    }

    @Override
    public void update(User user) {
        userDAO.update(user);
    }
}
