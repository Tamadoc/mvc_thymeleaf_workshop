package se.lexicon.teri.mvc_thymeleaf_workshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.tools.JavaCompiler;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("date", new java.util.Date());

        return "index";
    }
}
