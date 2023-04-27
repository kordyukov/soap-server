package com.example.soapserver.service;

import lombok.RequiredArgsConstructor;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ServerSoapImpl implements ServerSoap {

    @Override
    public ServerFactoryBean serverSoapStart() {
        ServerFactoryBean factory = new ServerFactoryBean();
        factory.setServiceClass(HelloWorld.class);
        factory.setAddress("http://localhost:5000/Hello");
        factory.setServiceBean(new HelloWorldImpl());

        factory.create();

//        JaxWsServerFactoryBean fb = new JaxWsServerFactoryBean();
//        fb.setServiceClass(HelloWorld.class);
//        fb.setWsdlLocation("http://localhost:5001/wdsl");
//        fb.create();


        return factory;
    }
}
