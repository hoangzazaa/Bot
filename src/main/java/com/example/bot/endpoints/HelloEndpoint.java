package com.example.bot.endpoints;

import com.example.bot.models.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloEndpoint {

    @GetMapping("/hello")
    public HelloResponse sayHello() {
        HelloResponse helloResponse = new HelloResponse();
        helloResponse.setName("zazaa");
        return helloResponse;
    }

}
