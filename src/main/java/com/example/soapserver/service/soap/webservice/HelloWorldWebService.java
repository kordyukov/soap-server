package com.example.soapserver.service.soap.webservice;

import jakarta.jws.WebService;

@WebService
public interface HelloWorldWebService {
    String hello(String text);
}
