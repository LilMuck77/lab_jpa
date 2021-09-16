package edu.wctc.lab_jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    //Just added this for extra practice.
    @RequestMapping("/")
    public String showHomePage(Model model){
        model.addAttribute("pageTitle", "Collector Of Photos");

        return "index";
    }

}
