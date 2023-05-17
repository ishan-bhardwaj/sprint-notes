package io.laymen.springnotes.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @Value("${user.name}")  // Fetches the value of user.name property from application.properties file (by default)
    private String name;

    // expose "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello() {
        return "Hello " + name;
    }

}
