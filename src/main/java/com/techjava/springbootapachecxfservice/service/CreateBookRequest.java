
package com.techjava.springbootapachecxfservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBookRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBookRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingRequest" type="{http://service.springbootapachecxfservice.techjava.com/}bookingRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBookRequest", propOrder = {
    "bookingRequest"
})
public class CreateBookRequest {

    @XmlElement(required = true)
    protected BookingRequest bookingRequest;

    /**
     * Gets the value of the bookingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BookingRequest }
     *     
     */
    public BookingRequest getBookingRequest() {
        return bookingRequest;
    }

    /**
     * Sets the value of the bookingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRequest }
     *     
     */
    public void setBookingRequest(BookingRequest value) {
        this.bookingRequest = value;
    }

}
