package com.redhat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.funqy.Funq;

public class GreetingFunction {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingFunction.class);

    @Funq("HttpTriggerJava")
    public String hello(final GreetingMessage greetingMessage) {

        LOGGER.info("received: {}", greetingMessage);
        return (greetingMessage == null | greetingMessage.text == null) ? "Hello, Azure Functions!" :  String.format("Hello, %s!", greetingMessage.text);
    }

}
