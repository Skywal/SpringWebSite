package com.bloom.springwebpage.DAO;

import com.bloom.springwebpage.Entity.User;
import com.bloom.springwebpage.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDAO {
    /**
     * темплейт створиться звідкись ззовні завдяки анотації @Autowired
     */
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<User> findAll() {
        String sql = "SELECT * FROM vebinar.user;"; // повертає всі записи із таблиці "user"
        return jdbcTemplate.query(sql, new UserMapper());
    }

    @Override
    public void save(User user) {
        String sql = "INSERT INTO vebinar.user (name, email, age) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge());
    }

    @Override
    public User getById(int id) {
        String sql = "SELECT * FROM vebinar.user WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new UserMapper(), id);
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM vebinar.user WHERE id=?";
        jdbcTemplate.update(sql, id);
    }

    @Override
    public void update(User user) {
        String sql = "UPDATE vebinar.user SET name=?, email=?, age=? WHERE id=?";
        jdbcTemplate.update(sql, user.getName(), user.getEmail(), user.getAge(), user.getId());
    }
}
