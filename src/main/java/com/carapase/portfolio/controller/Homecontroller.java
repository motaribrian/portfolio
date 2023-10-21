package com.carapase.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Homecontroller {
   @GetMapping("/")
    private String getHome(){
        return "index";
    }
    
}
