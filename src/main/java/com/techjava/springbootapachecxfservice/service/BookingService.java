package com.techjava.springbootapachecxfservice.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-12-04T16:33:30.002+01:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://service.springbootapachecxfservice.techjava.com/", name = "BookingService")
@XmlSeeAlso({ObjectFactory.class})
public interface BookingService {

    @WebMethod
    @RequestWrapper(localName = "createBookRequest", targetNamespace = "http://service.springbootapachecxfservice.techjava.com/", className = "com.techjava.springbootapachecxfservice.service.CreateBookRequest")
    @ResponseWrapper(localName = "createBookRequestResponse", targetNamespace = "http://service.springbootapachecxfservice.techjava.com/", className = "com.techjava.springbootapachecxfservice.service.CreateBookRequestResponse")
    @WebResult(name = "bookingResponse", targetNamespace = "")
    public com.techjava.springbootapachecxfservice.service.BookingResponse createBookRequest(
        @WebParam(name = "bookingRequest", targetNamespace = "")
        com.techjava.springbootapachecxfservice.service.BookingRequest bookingRequest
    );
}
