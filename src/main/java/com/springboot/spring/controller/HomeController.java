package com.springboot.spring.controller;

import com.springboot.spring.data.User;
import com.springboot.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UserService userService;
//    private CalendarService calendarService;

    @RequestMapping("/test")
    public String list(Model model) {
        List<User> user = userService.print();
        System.out.println("user size: " + user.size());
        model.addAttribute("userList", user);
        return "list";
    }

    @RequestMapping("/")
    public ModelAndView test() {
        return new ModelAndView("index");
//        return "index";
    }
}
