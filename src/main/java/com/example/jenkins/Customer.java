package com.example.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class Customer {
    @RestController
    @RequestMapping
    public class Controller {


        @GetMapping
        public String deneme2() {
            return "heloo word";
        }
    }
}
