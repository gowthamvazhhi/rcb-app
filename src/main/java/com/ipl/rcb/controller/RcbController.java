package com.ipl.rcb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RcbController {
    
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("teamName", "Royal Challengers Bangalore");
        model.addAttribute("teamShortName", "RCB");
        model.addAttribute("founded", "2008");
        model.addAttribute("homeGround", "M. Chinnaswamy Stadium, Bangalore");
        model.addAttribute("captain", "Rajat Patidar"); // Updated captain as requested
        model.addAttribute("coach", "Andy Flower");
        model.addAttribute("titles", "1"); // Updated title count as requested
        model.addAttribute("teamColor", "#EC1C24");
        model.addAttribute("teamMotto", "Play Bold");
        
        return "index";
    }
}
