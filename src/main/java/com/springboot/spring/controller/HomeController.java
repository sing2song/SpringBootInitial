package com.springboot.spring.controller;

import com.springboot.spring.data.Calendar;
import com.springboot.spring.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private CalendarService calendarService;

    @RequestMapping("/calendar")
    public String calendar(Model model) {

        Calendar calendar = calendarService.printCalendar();
        model.addAttribute()
    }
    @RequestMapping("/")
    public String test() {
        return "Hello Test";
    }
}
