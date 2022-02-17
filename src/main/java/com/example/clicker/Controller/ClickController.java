package com.example.clicker.Controller;

import com.example.clicker.DB.TestDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ClickController {


    //Контроллер, который при запросе адреса выдает наш шаблон HTML
    @RequestMapping(value = "/")
    public String helloWorldController (TestDB test, Model model) {
        model.addAttribute("message", test.getCountDB());
        return "helloClick";
    }

    @PostMapping(value = "/")
    public void print (TestDB test, Model model) {
        //model.getAttribute("message");
        System.out.println(model.getAttribute("message"));
    }
}