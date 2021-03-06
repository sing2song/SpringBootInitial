package com.springboot.spring.controller;

import com.springboot.spring.data.User;
import com.springboot.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public ModelAndView list() {
        ModelAndView view = new ModelAndView();
        view.setViewName("list");
        List<User> userList = userService.print();
//        User userList = userService.print();
        view.addObject("userList", userList);
        return view;
    }

    @RequestMapping("/")
    public ModelAndView test() {
        return new ModelAndView("index");
    }
}
