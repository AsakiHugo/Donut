package com.example.donut.controller;

import com.example.donut.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @RequestMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("donuts", mainService.listAllProducts());
        return "index";
    }

    @GetMapping("/menus")
    public String menus(Model model) {
        model.addAttribute("donuts", mainService.listAllProducts());
        return "menus";
    }

    @GetMapping("/menus/delete-product")
    public String deleteMenu(@RequestParam("id") int id) {
        mainService.deleteProduct(id);
        return "redirect:/menus";
    }

    @GetMapping("/menus/menu-details")
    public String menuDetails(Model model, @RequestParam("id") int id) {
        model.addAttribute("donut", mainService.findProductById(id));
        return "menuDetails";
    }
}
