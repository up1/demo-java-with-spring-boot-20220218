package com.example.day02.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface ValidationRule {
}

@Component
class EmailValidationV1 implements ValidationRule {

}

@Component
class EmailValidationV2 implements ValidationRule {

}

@Component
class DemoUseInterface {
    @Autowired
    private ValidationRule emailValidationV2;
}
