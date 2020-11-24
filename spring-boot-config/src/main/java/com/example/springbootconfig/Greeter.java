package com.example.springbootconfig;

public class Greeter {
    private String message;

    public Greeter() {
        this.message = message;
    }

    public Greeter(String message) {
        this.message = message;
        System.out.println(this.message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
