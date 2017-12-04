package com.techjava.springbootapachecxfclient.config;

import com.techjava.springbootapachecxfservice.service.BookingService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {

    private static final String BASE_URL = "/services/";
    private static final String SERVICE_URL = "bookingservice";

    @Bean
    public BookingService bookingServiceClient(){
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(BookingService.class);
        jaxWsProxyFactoryBean.setAddress("http://localhost:8085"+ BASE_URL + SERVICE_URL);
        return (BookingService) jaxWsProxyFactoryBean.create();
    }
}
