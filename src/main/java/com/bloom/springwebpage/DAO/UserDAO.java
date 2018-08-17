package com.bloom.springwebpage.DAO;

import com.bloom.springwebpage.Entity.User;

import java.util.List;

/**
 * Data Access Object
 * база даних
 */
public interface UserDAO {
    /**
     * список всіх користувачів у базі даних
     * @return List всіх користувачів із БД
     */
    List<User> findAll();

    void save(User user);
    User getById(int id);
    void delete(int id);
    void update(User user);
}
