package com.example.jenkins.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController("customer")
    public class CustomerController {
        @GetMapping()
        public String home() {
            return "Hello, Worg<easerg<ld!";

        }
    }


