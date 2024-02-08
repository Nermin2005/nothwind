package com.nermin.nothwind.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestControl {

    @GetMapping("/salam")
    public String Salamla() {
        return "Salam,Boostcamp 7.01";
    }

}
