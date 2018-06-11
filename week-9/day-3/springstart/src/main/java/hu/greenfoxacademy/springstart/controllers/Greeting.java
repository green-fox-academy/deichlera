package hu.greenfoxacademy.springstart.controllers;

public class Greeting {

    long id;
    String content;


    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
        this.getId();
        this.getContent();
    }
}
