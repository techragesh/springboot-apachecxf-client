
package com.techjava.springbootapachecxfservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createBookRequestResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createBookRequestResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingResponse" type="{http://service.springbootapachecxfservice.techjava.com/}bookingResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createBookRequestResponse", propOrder = {
    "bookingResponse"
})
public class CreateBookRequestResponse {

    @XmlElement(required = true)
    protected BookingResponse bookingResponse;

    /**
     * Gets the value of the bookingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BookingResponse }
     *     
     */
    public BookingResponse getBookingResponse() {
        return bookingResponse;
    }

    /**
     * Sets the value of the bookingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingResponse }
     *     
     */
    public void setBookingResponse(BookingResponse value) {
        this.bookingResponse = value;
    }

}
