package com.example.restanddb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
    @GetMapping("/")
    public String getMessage() {
        return "Hello";
    }
}
