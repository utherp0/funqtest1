package org.uth.funqtest.funqy.cloudevent;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@QuarkusTest
public class FunqyTest {

    @Test
    public void testCloudEvent1() {
        RestAssured.given().contentType("application/json")
                .header("ce-specversion", "1.0")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-type", "event1")
                .header("ce-source", "test")
                .body("{\"payload\":\"test1\"}")
                .post("/")
                .then().statusCode(200);
    }

    @Test
    public void testCloudEvent2() {
        RestAssured.given().contentType("application/json")
                .header("ce-specversion", "1.0")
                .header("ce-id", UUID.randomUUID().toString())
                .header("ce-type", "event2")
                .header("ce-source", "test")
                .body("{\"payload\":\"test2\"}")
                .post("/")
                .then().statusCode(200);
    }

}
