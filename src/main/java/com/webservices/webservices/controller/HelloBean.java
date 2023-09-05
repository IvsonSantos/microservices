package com.webservices.webservices.controller;

public class HelloBean {

    private String message;
    public HelloBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
