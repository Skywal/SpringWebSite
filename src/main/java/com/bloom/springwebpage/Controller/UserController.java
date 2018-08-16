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
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/hello") // оброблятиме за запитом
    public String hello(){ // назва шаблону що створений у views
        return "hello";
    }
}
