package com.example.soapserver.service.rest;

import com.example.soapserver.service.HelloWorld;
import com.example.soapserver.service.HelloWorldImpl;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.frontend.ServerFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServerRestSoapImpl implements ServerRestSoap {
    @Value("${server-rest-soap.rest-uri-address}")
    private String restServerUri;

    @Override
    public String serverSoapStart() {
        ServerFactoryBean factory = new ServerFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress(restServerUri);
        factory.setServiceBean(new HelloWorldImpl());

        factory.create();

        return restServerUri;
    }
}
