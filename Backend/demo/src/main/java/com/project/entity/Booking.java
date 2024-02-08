package com.project.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_booking")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int booking_id;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "p_id")
	private Player bookedBy;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "v_id")
	private Venue venue;
	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "c_id")
	private Coach coach;
	@ManyToOne
	@JoinColumn(name = "s_id")
	private Sport sport;
	private LocalDate date;
	private LocalTime startTime;
	private LocalTime endTime;
	
	
	public int getBooking_id() {
		return booking_id;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public Sport getSport() {
		return sport;
	}
	public void setSport(Sport sport) {
		this.sport = sport;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public Player getBookedBy() {
		return bookedBy;
	}
	public void setBookedBy(Player bookedBy) {
		this.bookedBy = bookedBy;
	}		
}
