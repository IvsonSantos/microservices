package com.webservices.webservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloController {

    @Autowired
    private MessageSource messageSource;

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

    @GetMapping(path = "/hello-inter")
    public String helloPath() {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage("good.morning", null, "default", locale);
    }

}
