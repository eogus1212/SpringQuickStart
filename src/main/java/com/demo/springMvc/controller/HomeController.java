package com.demo.springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("data", "hello, spring from intellij");
        return "index";
    }
}
