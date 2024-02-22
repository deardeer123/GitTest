package com.example.GitTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/")
    public String main(){
        System.out.println("11111111123123123123123sfddfsafgkdgjkldfgjkl");
        return "main";
    }
}
