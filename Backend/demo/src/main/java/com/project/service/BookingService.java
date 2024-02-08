package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Booking;
import com.project.entity.BookingDetails;
import com.project.entity.Player;
import com.project.repository.BookingRepository;
import com.project.repository.PlayerRepository;

@Service
public class BookingService {
	@Autowired
	BookingRepository bookingRepository;
	
	@Autowired
	PlayerRepository playerRepository;
	
	public void addBooking(BookingDetails booking) {
		Player player=playerRepository.getById(booking.getP_id());
		List<Booking> bookings=player.getP_booking_list();
		Booking booking2=new Booking();
		booking2.setBookedBy(player);
		bookings.add(booking2);
		player.setP_booking_list(bookings);
		booking2.setBookedBy(player);
		bookingRepository.save(booking2);
	}
	public List<Booking> getBookings(){
		return bookingRepository.findAll();
	}
	public Booking getBooking(int id) {
		return bookingRepository.getById(id);
	}

}
