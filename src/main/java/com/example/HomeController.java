package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
class HomeController {

    //Default to heroes1 page:
    @RequestMapping("/")
    String defaultPage() {
         return "heroes1";
    }


    @RequestMapping("/heroes1")
    String heroes1(Model model) {
         return "heroes1";
    }

    @RequestMapping("/heroes2")
    String heroes2() {
        return "heroes2";
    }


    //Here is the original index made by spring boot officially:
    //Using for index page.
    @RequestMapping("/index")
    String index(Model model) {
        model.addAttribute("now", LocalDateTime.now());
        return "index";
    }
    @RequestMapping("properties")
    @ResponseBody
    java.util.Properties properties() {
        return System.getProperties();
    }
    // >>>>>>End original index made by spring boot officially.

}