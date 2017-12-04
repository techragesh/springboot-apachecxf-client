
package com.techjava.springbootapachecxfservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookingRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bookingDesc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bsnNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="bookingId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingRequest", propOrder = {
    "bookingName",
    "bookingDesc",
    "bsnNr"
})
public class BookingRequest {

    @XmlElement(required = true)
    protected String bookingName;
    @XmlElement(required = true)
    protected String bookingDesc;
    @XmlElement(required = true)
    protected String bsnNr;
    @XmlAttribute(name = "bookingId", required = true)
    protected String bookingId;

    /**
     * Gets the value of the bookingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingName() {
        return bookingName;
    }

    /**
     * Sets the value of the bookingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingName(String value) {
        this.bookingName = value;
    }

    /**
     * Gets the value of the bookingDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDesc() {
        return bookingDesc;
    }

    /**
     * Sets the value of the bookingDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDesc(String value) {
        this.bookingDesc = value;
    }

    /**
     * Gets the value of the bsnNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsnNr() {
        return bsnNr;
    }

    /**
     * Sets the value of the bsnNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsnNr(String value) {
        this.bsnNr = value;
    }

    /**
     * Gets the value of the bookingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingId() {
        return bookingId;
    }

    /**
     * Sets the value of the bookingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingId(String value) {
        this.bookingId = value;
    }

}
