package com.bloom.springwebpage.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * клас який при старті застосунку буде створювати контекс на основі SpringConfig та WebConfig файлів
 * тут буде створено DispatcherServlet
 */
public class WebAppInitializer implements WebApplicationInitializer {
    private final static String DISPATCHER = "dispatcher";

    /**
     * метод який запускається при старті застосунку
     * @param servletContext
     * @throws ServletException
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        // реєструємо конфіг класи
        context.register(SpringConfig.class, WebConfig.class);
        // встановлюємо контекст
//        context.setServletContext(servletContext);
        servletContext.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER, new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(1);
        dispatcher.addMapping("/"); // щоб обробляв все починаючи від самого початку
    }
}
