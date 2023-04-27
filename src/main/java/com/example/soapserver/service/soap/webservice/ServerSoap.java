package com.example.soapserver.service.soap.webservice;

import com.example.soapserver.service.HelloWorld;
import com.example.soapserver.service.HelloWorldImpl;
import jakarta.jws.WebService;
import jakarta.xml.ws.Endpoint;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.cxf.feature.LoggingFeature;
import org.apache.cxf.jaxws.spi.ProviderImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@WebService
@RequiredArgsConstructor
public class ServerSoap {
    @Value("${server-rest-soap.soap-uri-address}")
    private String soapServerUri;


    public String serverSoapStart() {
        HelloWorldWebService implementor = new HelloWorldWebServiceImpl();
        ProviderImpl.provider().createAndPublishEndpoint(soapServerUri,
                implementor,
                new LoggingFeature());

        return soapServerUri;
    }
}
