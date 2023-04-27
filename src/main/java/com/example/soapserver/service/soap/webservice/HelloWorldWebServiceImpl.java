package com.example.soapserver.service.soap.webservice;

public class HelloWorldWebServiceImpl implements HelloWorldWebService {
    @Override
    public String hello(String text) {
        return "Hi " + text;
    }
}
