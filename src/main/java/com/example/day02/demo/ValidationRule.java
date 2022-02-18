package com.example.day02.demo;

import org.springframework.stereotype.Component;

public interface ValidationRule {
}

@Component
class EmailValidation implements ValidationRule {

}

@Component
class DomainNameValidation implements ValidationRule {

}
