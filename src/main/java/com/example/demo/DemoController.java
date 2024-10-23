package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    private final RestTemplate restTemplate;

    public DemoController(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String hello() {
        return restTemplate.getForObject("www.zaobao.com", String.class);
    }

}
