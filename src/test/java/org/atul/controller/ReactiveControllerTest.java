package org.atul.controller;


import org.atul.poc.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

//@Import(ReactiveController.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = DemoApplication.class)
public class ReactiveControllerTest {

    @Autowired
    private WebTestClient webClient;



    @Test
    public void testSample(){
        webClient
                .get().uri("test/getTest") // GET method and URI
                //.accept(MediaType.TEXT_PLAIN) //setting ACCEPT-Content
                .exchange() //gives access to response
                .expectStatus().isOk() //checking if response is OK
                .expectBody(String.class).isEqualTo("Hello World!"); // checking for response type and message
    }
}
