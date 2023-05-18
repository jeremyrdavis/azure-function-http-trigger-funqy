package com.redhat;

public class GreetingMessage {

    String text;

    public GreetingMessage() {
    }

    public GreetingMessage(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "GreetingMessage{" +
                "text='" + text + '\'' +
                '}';
    }
}
