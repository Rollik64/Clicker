package com.example.clicker.Controller;

import com.example.clicker.DB.TestDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ClickController {

    //Контроллер, который при запросе адреса выдает наш шаблон HTML
    @RequestMapping(value = "/")
    public String helloWorldController(@RequestParam(name = "0", required = false) String name, Model model) {
        model.addAttribute("counter-label", name);
        return "helloClick";
    }



/*
    @RequestMapping(value = "/")
    public String byeWorldController(Model model) {
        TestDB test = new TestDB();
        model.addAttribute("0", test);
        return "helloClick";
    }
*/
}