package com.example.demo.beans;

public class HelloWorld {
    private String message;

    public void init(){
        System.out.println("Hello world init");
    }
    public void destroy(){
        System.out.println("destroy method is called for helloworld");
    }

    public HelloWorld() {
        System.out.println("called ");
    }

    public HelloWorld(String message) {
        System.out.println("called ");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}