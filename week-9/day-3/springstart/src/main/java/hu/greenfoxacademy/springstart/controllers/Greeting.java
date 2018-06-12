package hu.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {


    private String content;
    private static final AtomicLong id = new AtomicLong();


    public static long add() {
        return id.incrementAndGet();
    }


    public long getId() {
        return id.get();
    }

    public String getContent() {
        return content;
    }

    public Greeting(String content) {
        Greeting.add();
        this.getId();
        this.getContent();
        this.content = content;
    }
}
