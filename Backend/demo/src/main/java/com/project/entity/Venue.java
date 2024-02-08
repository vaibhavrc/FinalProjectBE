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
@Table(name = "tbl_venue")
public class Venue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int v_id;
	private String v_name;
	private String v_city;
	private String v_email;
	private String v_contact_number;
	@OneToMany(mappedBy = "venue")
	@JsonManagedReference
	private List<Booking> v_bookings;
	private List<Sport> v_sports;
	
	public int getV_id() {
		return v_id;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	public String getV_city() {
		return v_city;
	}
	public void setV_city(String v_city) {
		this.v_city = v_city;
	}
	public String getV_email() {
		return v_email;
	}
	public void setV_email(String v_email) {
		this.v_email = v_email;
	}
	public String getV_contact_number() {
		return v_contact_number;
	}
	public void setV_contact_number(String v_contact_number) {
		this.v_contact_number = v_contact_number;
	}
	public List<Booking> getV_bookings() {
		return v_bookings;
	}
	public void setV_bookings(List<Booking> v_bookings) {
		this.v_bookings = v_bookings;
	}
	public List<Sport> getV_sports() {
		return v_sports;
	}
	public void setV_sports(List<Sport> v_sports) {
		this.v_sports = v_sports;
	}	
}
