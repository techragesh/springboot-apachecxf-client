
package com.techjava.springbootapachecxfservice.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.techjava.springbootapachecxfservice.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookingRequest_QNAME = new QName("http://service.springbootapachecxfservice.techjava.com/", "bookingRequest");
    private final static QName _BookingResponse_QNAME = new QName("http://service.springbootapachecxfservice.techjava.com/", "bookingResponse");
    private final static QName _CreateBookRequest_QNAME = new QName("http://service.springbootapachecxfservice.techjava.com/", "createBookRequest");
    private final static QName _CreateBookRequestResponse_QNAME = new QName("http://service.springbootapachecxfservice.techjava.com/", "createBookRequestResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.techjava.springbootapachecxfservice.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookingRequest }
     * 
     */
    public BookingRequest createBookingRequest() {
        return new BookingRequest();
    }

    /**
     * Create an instance of {@link BookingResponse }
     * 
     */
    public BookingResponse createBookingResponse() {
        return new BookingResponse();
    }

    /**
     * Create an instance of {@link CreateBookRequest }
     * 
     */
    public CreateBookRequest createCreateBookRequest() {
        return new CreateBookRequest();
    }

    /**
     * Create an instance of {@link CreateBookRequestResponse }
     * 
     */
    public CreateBookRequestResponse createCreateBookRequestResponse() {
        return new CreateBookRequestResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springbootapachecxfservice.techjava.com/", name = "bookingRequest")
    public JAXBElement<BookingRequest> createBookingRequest(BookingRequest value) {
        return new JAXBElement<BookingRequest>(_BookingRequest_QNAME, BookingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springbootapachecxfservice.techjava.com/", name = "bookingResponse")
    public JAXBElement<BookingResponse> createBookingResponse(BookingResponse value) {
        return new JAXBElement<BookingResponse>(_BookingResponse_QNAME, BookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springbootapachecxfservice.techjava.com/", name = "createBookRequest")
    public JAXBElement<CreateBookRequest> createCreateBookRequest(CreateBookRequest value) {
        return new JAXBElement<CreateBookRequest>(_CreateBookRequest_QNAME, CreateBookRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateBookRequestResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.springbootapachecxfservice.techjava.com/", name = "createBookRequestResponse")
    public JAXBElement<CreateBookRequestResponse> createCreateBookRequestResponse(CreateBookRequestResponse value) {
        return new JAXBElement<CreateBookRequestResponse>(_CreateBookRequestResponse_QNAME, CreateBookRequestResponse.class, null, value);
    }

}
