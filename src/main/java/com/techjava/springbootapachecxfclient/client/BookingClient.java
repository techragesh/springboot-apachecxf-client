package com.techjava.springbootapachecxfclient.client;


import com.techjava.springbootapachecxfservice.service.BookingRequest;
import com.techjava.springbootapachecxfservice.service.BookingResponse;
import com.techjava.springbootapachecxfservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingClient {

    @Autowired
    private BookingService bookingService;

    public BookingResponse createBookingRequest(BookingRequest bookingRequest){
        return bookingService.createBookRequest(bookingRequest);
    }
}

