package com.poc.configproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ExampleController {
    @Autowired
    MessageProperties messageProperties;

    @GetMapping("/welcome")
    public String welcome() {
        return messageProperties.getWelcome();
    }

    @GetMapping("/bye")
    public String goodBye() {
        return messageProperties.getGoodbye();
    }
}
