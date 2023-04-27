package com.example.soapserver.controller;

import com.example.soapserver.service.ServerSoap;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ServerSoapController {
    private final ServerSoap serverSoap;

    @GetMapping("/start")
    public String getStartServer() throws InterruptedException {
        serverSoap.serverSoapStart();


        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting ...");
        System.exit(0);

        return "server exist";
    }
}
