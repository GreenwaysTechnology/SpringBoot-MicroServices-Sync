package com.example.demo.beans.extensions.annotations.stero;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
