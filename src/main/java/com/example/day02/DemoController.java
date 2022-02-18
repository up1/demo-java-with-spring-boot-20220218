package com.example.day02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo/{id}")
    public DemoResponse xxxx(@PathVariable int id) {
        return new DemoResponse();
    }

}
