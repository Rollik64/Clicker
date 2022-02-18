package com.example.clicker.Controller;

import com.example.clicker.Model.Count;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ClickController {


    //Контроллер, который при запросе адреса выдает наш шаблон HTML
    @RequestMapping(value = "/")
    public String helloWorldController (Count test, Model model) {
        model.addAttribute("message", test.getCountDB());
        return "helloClick";
    }


}