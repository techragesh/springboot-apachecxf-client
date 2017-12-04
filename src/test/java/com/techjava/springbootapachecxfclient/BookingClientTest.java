package com.techjava.springbootapachecxfclient;


import com.techjava.springbootapachecxfclient.client.BookingClient;
import com.techjava.springbootapachecxfclient.config.ClientConfig;
import com.techjava.springbootapachecxfservice.service.BookingRequest;
import com.techjava.springbootapachecxfservice.service.BookingResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import(ClientConfig.class)
public class BookingClientTest {

    @Autowired
    BookingClient bookingClient;

    @Test
    public void createBookingRequest(){
        BookingRequest bookingRequest = new BookingRequest();
        bookingRequest.setBookingId("1");
        bookingRequest.setBookingName("CoreJava");
        bookingRequest.setBookingDesc("Core Java");
        bookingRequest.setBsnNr("123456778");
        BookingResponse bookingResponse = bookingClient.createBookingRequest(bookingRequest);
        assertEquals("200", bookingResponse.getStatus());
        assertEquals("SUCCESS", bookingResponse.getMessage());
    }
}
