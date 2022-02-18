package com.example.day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/demo/{id}")
    public DemoResponse xxxx(@PathVariable int id) {
        String result = demoService.process(id);
        return new DemoResponse(id, result);
    }

}
