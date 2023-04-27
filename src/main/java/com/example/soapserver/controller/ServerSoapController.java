package com.example.soapserver.controller;

import com.example.soapserver.service.rest.ServerRestSoap;
import com.example.soapserver.service.soap.webservice.ServerSoap;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerSoapController {
    private final ServerRestSoap serverRestSoap;
    private final ServerSoap serverSoap;

    @GetMapping("/start-soap-rest")
    public String getStartRestServer() {
        return "Server Rest Soap is started %s \nServer Soap is started %s"
                .formatted(serverRestSoap.serverSoapStart(),
                        serverSoap.serverSoapStart());
    }
}
