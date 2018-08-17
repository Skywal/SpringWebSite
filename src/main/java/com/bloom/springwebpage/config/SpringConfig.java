package com.bloom.springwebpage.config;

import com.bloom.springwebpage.DAO.UserDAO;
import com.bloom.springwebpage.DAO.UserDaoImpl;
import com.bloom.springwebpage.Service.UserService;
import com.bloom.springwebpage.Service.UserServiceIml;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    /**
     * робота із БД через інтерфейс UserDAO
     * @return
     */
    @Bean
    public JdbcTemplate getJdbcTemplate(){
        //data source це той об'єкт який описуватиме connection до бази даних
        return new JdbcTemplate(getDataSource());
    }

    /**
     * цей бін створить dataSource в якому лежатимуть певні настройки для того щоб під'єднатися до бази даних
     * @return
     */
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/mysql?useSll=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"); //connection URL до бази даних та не використовувати Sll
        dataSource.setUsername("root");
        dataSource.setPassword("Img147963");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    /**
     *  цей бін використовується у класі UserService
     */
    @Bean
    public UserDAO getUserDao(){
        return new UserDaoImpl(getJdbcTemplate());
    }

    /**
     * Реалізація сервісу
     * @return
     */
    @Bean
    public UserService getUserService(){
        return new UserServiceIml();
    }
}
