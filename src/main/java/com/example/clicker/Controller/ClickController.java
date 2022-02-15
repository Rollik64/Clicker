package com.example.clicker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ClickController {

    //Контроллер, который при запросе адреса выдает наш шаблон HTML
    @RequestMapping(value = "/")
    public String helloWorldController(@RequestParam(name = "counter-label", required = false) String name, Model model) {
        model.addAttribute("counter-label", name);
        return "helloClick";
    }

    /*
    @PostMapping(value = "/")
    public String byeWorldController(@RequestParam(name = "counter-label", required = false) String name, Model model) {
        Integer.parseInt(name);
        name++;
        return name;
    } */
}