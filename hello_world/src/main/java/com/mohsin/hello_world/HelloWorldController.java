package com.mohsin.hello_world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        // Implemented using String Templates
        return """
                 { message: Hello World - Spring Boot! }
                """;
    }
}
