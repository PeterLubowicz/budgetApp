package com.salem.budgetApp.controllers;

import com.salem.budgetApp.enums.MonthsEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

    @GetMapping("/months")
    public List<MonthsEnum> getMonths(){
        return Arrays.asList(MonthsEnum.values());
    }
}
