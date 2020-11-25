package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {
    private AtomicLong counter = new AtomicLong();

    @GetMapping("/hello")
    public Hello getHelloWordObject() {
        Hello hello = new Hello();
        hello.setMessage("Hi there! you are number " + counter.incrementAndGet());
        return hello;
    }
}
