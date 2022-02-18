package com.example.day02;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    public String process(int id) {
        return "Result with id = " + id;
    }
}