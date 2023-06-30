package com.example.demo.controller;

import com.example.demo.obj.AA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    AA aa;
    //@RequestMapping(method = {"get"}) -> 이건 예전 방식이고
    //지금은 @GetMapping사용한다.
    @GetMapping("/")
    public  String index(){
        System.out.println(aa);
        return "index";
    }
}
