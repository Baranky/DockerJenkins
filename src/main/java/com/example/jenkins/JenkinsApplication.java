package com.example.jenkins;

import com.example.jenkins.entity.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;;

@SpringBootApplication
public class JenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);

        Customer customer=new Customer();
        customer.setId(1);
        customer.setName("baran");
    }
}
