package com.bloom.springwebpage.Service;

import com.bloom.springwebpage.Entity.User;

import java.util.List;

/**
 * логіка
 * виносити всю логіку із контролерів в сервісі та всю логіку з DAO сюди
 * бізнес логіка повинна бути тут
 */
public interface UserService {

    List<User> findAll(); // поки робить все те ж що і UserDAO

    void save(User user);
    User getById(int id);
    void delete(int id);
    void update(User user);
}
