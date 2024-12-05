package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/index")
    public String home() {
        return "index"; // Возвращает home.html из templates
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Возвращает about.html из templates
    }

    @GetMapping("/naryn")
    public String naryn() {
        return "naryn"; // Возвращает naryn.html из templates
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Возвращает contact.html из templates
    }

    @GetMapping("/sightseein")
    public String sightseeing() {
        return "sightseein"; // Возвращает sightseeing.html из templates
    }
}
