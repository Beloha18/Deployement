package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerWeb {

    @GetMapping(path = "/")
    public String accueillir() {
        return "index";
    }

}