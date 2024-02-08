package com.project.controllers;

import java.util.List;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Booking;
import com.project.entity.BookingDetails;
import com.project.service.BookingService;

@RestController
public class BookingController {
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/addbooking")
	public void addBooking(@RequestBody BookingDetails booking) {
		bookingService.addBooking(booking);
	}
	
	@GetMapping("/bookings")
	public List<Booking> getBookings(){
		return bookingService.getBookings();
	}

}
