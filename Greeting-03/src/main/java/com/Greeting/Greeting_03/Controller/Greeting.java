package com.Greeting.Greeting_03.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {

    @Autowired
    public WelcomeOpenClient welcomeOpenClient;

    @GetMapping("/greet")
    public String getGreetMessage(){
        String msg = "Good Morning !! ";
        return msg;
    }

    @GetMapping("/greet/welcome")
    public String getWelcomeAndGreetMessage(){
        String grtmsg = "Good Morning !! ";
        String welmsg = welcomeOpenClient.getWelcomeMessage();
        return welmsg+",      "+grtmsg;
    }

}
