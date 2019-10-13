package com.springboot.spring.service;

import com.springboot.spring.data.Calendar;
import com.springboot.spring.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarServiceImpl implements CalendarService{

    @Autowired
    CalendarRepository calendarRepository;

    @Override
    public Calendar printCalendar() {
        Calendar calendar = calendarRepository.getCalendar();
        return calendar;
    }
}
