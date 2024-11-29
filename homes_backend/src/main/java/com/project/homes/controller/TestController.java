package com.project.homes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/testing")
    public void testGetMapping(){
        System.out.println("Is Working");
        return;
    }

}
