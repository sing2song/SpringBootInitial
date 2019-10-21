package com.springboot.spring.controller;

import com.springboot.spring.data.User;
import com.springboot.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private UserService userService;
//    private CalendarService calendarService;

    @RequestMapping("/test")
    public String list(Model model) {
        List<User> user =  userService.print();
        model.addAttribute("list", user);
        return "list";
    }
    @RequestMapping("/")
    public String test() {
        return "Hello Test";
    }
}
