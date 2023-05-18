package com.redhat;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingFunctionTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("HttpTriggerJava")
          .then()
             .body(containsString("Hello, Azure Functions!"));
    }

}