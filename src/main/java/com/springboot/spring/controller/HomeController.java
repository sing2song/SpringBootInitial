package com.springboot.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

//    @Autowired
//    private CalendarService calendarService;

    @RequestMapping("/")
    public String test() {
        return "Hello Test";
    }
}
