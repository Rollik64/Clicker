package com.example.clicker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ClickController {

    //Контроллер, который при запросе адреса выдает наш шаблон HTML
    @RequestMapping(value = "/")
    public String helloWorldController(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "helloClick";
    }
}
