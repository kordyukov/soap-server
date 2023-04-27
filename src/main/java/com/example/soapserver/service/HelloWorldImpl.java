package com.example.soapserver.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String greetings(String text) {
        return "Hi " + text;
    }
}
