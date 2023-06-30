package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Restcontroller 는 문자열 가져옴
//@Controller 는 html 주소 가져옴
@Controller
public class MainHtmlController {

    @GetMapping("aa")
    public String aa(
            Model model,
            String num1,
            String num2){
        System.out.println("출력");
        System.out.println(num1);
        System.out.println(num2);

        if(num1 == null) num1="0";
        if(num2 == null) num2="0";

            model.addAttribute(
                    "data",
                    "계산기");
            model.addAttribute("result",
                    Integer.parseInt(num1) + Integer.parseInt(num2));

        return "aa";
    }

}

//        model.addAttribute(
//                "data",
//                "mydata");
//        model.addAttribute("result",
//                Integer.parseInt(num1) + Integer.parseInt(num2));


//    @GetMapping("aa")
//    public String aa(
//            Model model,
//            String num3,
//            String num4){
//        System.out.println("출력");
//        System.out.println(num3);
//        System.out.println(num4);
//
//        if(num3 == null) num3="0";
//        if(num4 == null) num4="0";
//        model.addAttribute(
//                "data",
//                "mydata");
//        model.addAttribute("result1",
//                Integer.parseInt(num3) - Integer.parseInt(num4));
//        return "aa";
//    }
