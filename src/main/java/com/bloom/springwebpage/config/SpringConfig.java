package com.bloom.springwebpage.config;

import com.bloom.springwebpage.Service.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
//    @Bean
//    public TestBean getTestBean(){
//        return new TestBean("Hello!");
//    }

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
        dataSource.setUrl("jdbc:mysql://localhost:3306/mysql?useSll=false"); //connection URL до бази даних та не використовувати Sll
        dataSource.setUsername("root");
        dataSource.setPassword("Img147963");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }
}
