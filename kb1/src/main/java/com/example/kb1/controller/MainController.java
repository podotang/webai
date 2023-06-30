package com.example.kb1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String gindex() {

        return "index";
    }

    @PostMapping
    //RequestParam
    public String pindex(@RequestParam(defaultValue = "0") String num1
            , @RequestParam(defaultValue = "+") String yon
            , @RequestParam(defaultValue = "0") String num2
            , Model model) {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("yon = " + yon);
        int result = 0;
//        대괄호 생략가능
        if (yon.equals("+"))
            result = Integer.parseInt(num1) + Integer.parseInt(num2);
        else if (yon.equals("-"))
            result = Integer.parseInt(num1) - Integer.parseInt(num2);
        else if (yon.equals("*"))
            result = Integer.parseInt(num1) * Integer.parseInt(num2);
        else if (yon.equals("/"))
            result = Integer.parseInt(num1) / Integer.parseInt(num2);
        model.addAttribute("result", result);
        return "index";
    }
}









