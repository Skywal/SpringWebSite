package com.bloom.springwebpage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.bloom.springwebpage.Controller") // де лежать контролери
public class WebConfig extends WebMvcConfigurerAdapter {
    @Bean
    public ViewResolver getViewResolver(){
        FreeMarkerViewResolver freeMarkerViewResolver = new FreeMarkerViewResolver();
        freeMarkerViewResolver.setOrder(1); // порядок у якому буде запускатися
        freeMarkerViewResolver.setSuffix(".ftl"); // розібратися
        freeMarkerViewResolver.setPrefix("");
        return freeMarkerViewResolver;
    }
    @Bean
    public FreeMarkerConfigurer getFreeMarkerConfigurer(){
        // де лежатимуть template
        FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer();
        freeMarkerConfigurer.setTemplateLoaderPaths("/", "/WEB-INF/views/"); //задаємо декілька шляхів до template
        return freeMarkerConfigurer;
    }
}
