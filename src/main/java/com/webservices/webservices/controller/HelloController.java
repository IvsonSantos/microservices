package com.webservices.webservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello world";
    }

    @GetMapping(value = "/helloBean")
    public HelloBean helloBean() {
        return new HelloBean("Hello Bean");
    }

    @GetMapping(path = "/hello/{name}")
    public HelloBean helloPath(@PathVariable String name) {
        return new HelloBean(String.format("Hello %s ", name));
    }

}
