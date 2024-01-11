package com.example.donut.controller;

import com.example.donut.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @RequestMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("donuts", mainService.listAllProducts());
        return "index";
    }
}
