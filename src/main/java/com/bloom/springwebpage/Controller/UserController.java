package com.bloom.springwebpage.Controller;


import com.bloom.springwebpage.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * робота з веб, обробка запитів з template
 */
@Controller
@RequestMapping("/") // обробляв все починаючи від
public class UserController {

    @Autowired // використання відповідного Bean
    public UserService userService;

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

    @GetMapping("/users")
    public String getAllUsers(Model model){ // model потрібна для передачі даних між view та
        model.addAttribute("users", userService.findAll()); // далі потрібно у views обробити userList
        return "usersList";
    }

    /**
     * обробка запросів від посилання у таблиці користувачів userList на конкретного користувача
     * @return
     */
    @GetMapping("/user/{id}")
    public String getById(@PathVariable("id") int id, Model model){
        model.addAttribute("user", userService.getById(id));
        return "showUser";
    }
}
