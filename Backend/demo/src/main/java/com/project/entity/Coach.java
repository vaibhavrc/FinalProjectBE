package com.project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "tbl_coach")
public class Coach {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int c_id;
	private String c_name;
	private int exp;
	private String c_city;
	private String c_email;
	private String c_contact_number;
	@OneToMany(mappedBy = "coach")
	@JsonManagedReference
	private List<Booking> c_bookings;
	private List<Sport> c_sports;
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getC_city() {
		return c_city;
	}
	public void setC_city(String c_city) {
		this.c_city = c_city;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	public String getC_contact_number() {
		return c_contact_number;
	}
	public void setC_contact_number(String c_contact_number) {
		this.c_contact_number = c_contact_number;
	}
	public List<Booking> getC_bookings() {
		return c_bookings;
	}
	public void setC_bookings(List<Booking> c_bookings) {
		this.c_bookings = c_bookings;
	}
	public List<Sport> getC_sports() {
		return c_sports;
	}
	public void setC_sports(List<Sport> c_sports) {
		this.c_sports = c_sports;
	}		
}
