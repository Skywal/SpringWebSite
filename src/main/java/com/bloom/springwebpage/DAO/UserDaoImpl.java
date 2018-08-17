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
        String sql = "SELECT * FROM user"; // повертає всі записи із таблиці "user"
        return jdbcTemplate.query(sql, new UserMapper());
    }
}
