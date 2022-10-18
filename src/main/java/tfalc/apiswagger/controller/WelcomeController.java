package tfalc.apiswagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping
    public String welcomeMessage() {
        return "Welcome to the APP with swagger";
    }
}