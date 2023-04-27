package com.example.soapserver.config;

import com.example.soapserver.service.soap.webservice.ServerSoap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerSoapConfig {

    @Bean
    public ServerSoap createServerSoap() {
        return new ServerSoap();
    }
}
