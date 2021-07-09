package com.tiwu.day3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController{

    @GetMapping("/hi")
    public String index (ModelMap map){

        map.addAttribute("host","http://blog.didispace.com");
        return "index";
    }




}