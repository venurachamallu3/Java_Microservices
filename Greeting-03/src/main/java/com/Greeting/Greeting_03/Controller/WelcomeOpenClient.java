package com.Greeting.Greeting_03.Controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="WELCOME-SERVICE")
public interface WelcomeOpenClient {

    @GetMapping("/welcome")
    public String getWelcomeMessage();


}
