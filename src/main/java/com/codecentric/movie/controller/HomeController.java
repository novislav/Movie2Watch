package com.codecentric.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by bojan on 2/1/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String getHomePage(){
        System.out.println("ctrl");
        return "redirect:/index.html";
    }
}
