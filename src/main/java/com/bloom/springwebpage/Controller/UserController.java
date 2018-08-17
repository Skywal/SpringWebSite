package com.bloom.springwebpage.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * робота з веб, обробка запитів з template
 */
@Controller
@RequestMapping("/") // обробляв все починаючи від
public class UserController {
    /**
     * обробка пустого рядка на старті
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }

    /**
     * коли в рядок записали слово hello
     * @return назву view елементу hello.ftl
     */
    @GetMapping("/hello") // оброблятиме за запитом
    public String hello(){ // назва шаблону що створений у views
        return "hello";
    }
}
