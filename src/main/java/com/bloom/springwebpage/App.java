package com.bloom.springwebpage;

import com.bloom.springwebpage.Service.TestBean;
import com.bloom.springwebpage.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        String name = testBean.getName();

        System.out.println( name );

    }

}
