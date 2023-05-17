package com.redhat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.quarkus.funqy.Funq;

public class GreetingFunction {

    private static final Logger LOGGER = LoggerFactory.getLogger(GreetingFunction.class);

    @Funq("HttpTriggerJava")
    public String hello(final String name) {

        LOGGER.info("received: {}", name);
        return name == null ? "Hello, Azure Functions!" :  String.format("Hello, %s!", name);
    }
}
