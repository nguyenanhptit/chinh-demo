package com.chinh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChinhController {
    @GetMapping("/")
    public ModelAndView sayHello() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
