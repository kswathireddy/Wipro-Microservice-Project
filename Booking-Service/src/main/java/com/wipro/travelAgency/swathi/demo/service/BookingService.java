package com.wipro.travelAgency.swathi.demo.service;


import com.wipro.travelAgency.swathi.demo.entity.Booking;
import com.wipro.travelAgency.swathi.demo.entity.BookingResponse;

public interface BookingService {



	Booking getById(Long id);

	Booking cancel(Long id);

	Booking addBooking(Booking booking);

	BookingResponse getBookingDetails(Long bookingId);

}
