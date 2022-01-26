package com.partha.ios.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String index() {
        return "<h1>Welcome to the home page!</h1>";
    }

}
