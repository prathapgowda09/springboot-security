package com.partha.ios.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String home(){
        return ("<h1>Welcome JPA!!</h1>");
    }

    @GetMapping("/user")
    public String user(){
        return ("<h1>Welcome User JPA!!</h1>");
    }

    @GetMapping("/admin")
    public String admin(){
        return ("<h1>Welcome Admin JPA!!</h1>");
    }


}
