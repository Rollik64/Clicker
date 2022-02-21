package com.example.clicker.Controller;

import com.example.clicker.Model.Count;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ClickController {


    //Контроллер, который при запросе адреса выдает наш шаблон HTML
    @RequestMapping(value = "/")
    public String helloWorldController (Count test, Model model) {
        model.addAttribute("message", test.getCountDB());
        return "helloClick";
    }

    //Контроллер, который получает параметр счетчика из шаблона HTML
    @PostMapping(value = "/")
    public String saveWorldController(@PathVariable ("message") int mess, Count test) {
        test.setCountDB(mess);
        return "helloClick";
    }






}