package config;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import utilities.RestAssureExtension;

public class TestConfig {
    public static RequestSpecification videoGame_requestSpec;

//    @Before
    public static void beforeScenario() {
        System.out.println("before");

        videoGame_requestSpec = new RequestSpecBuilder().
                setBaseUri("http://localhost").
                setPort(8080).
                setBasePath("/app/").
                addHeader("Content-Type", "application/json").
                addHeader("Accept", "application/json").
                build();

    }

    @Before
    public static void testSetup(){
        RestAssureExtension restAssureExtension = new RestAssureExtension();
    }

    @After
    public static void afterScenario() {
        System.out.println("after");
    }
}
