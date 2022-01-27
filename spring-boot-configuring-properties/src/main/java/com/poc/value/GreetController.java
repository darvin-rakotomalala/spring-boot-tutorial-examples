package com.poc.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/properties")
public class GreetController {

    // une valeur par défaut si n'est pas disponible
    // @Value("${message.default.welcome:SomeDefaultValue}")
    // private String welcomeMessage;

    @Value("${message.default.welcome}")
    private String welcomeMessage;

    @Value("${message.default.goodbye}")
    private String goodBye;

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeMessage;
    }

    @GetMapping("/bye")
    public String bye() {
        return goodBye;
    }
}
