package com.project.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_player")
public class Player {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int p_id;
	private String p_name;
	private int age;
	private String city;
	private long p_contact_number;
	private String p_email;
	@OneToMany(mappedBy = "bookedBy")
	@JsonManagedReference
	private List<Booking> p_booking_list;
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getP_contact_number() {
		return p_contact_number;
	}
	public void setP_contact_number(long p_contact_number) {
		this.p_contact_number = p_contact_number;
	}
	public String getP_email() {
		return p_email;
	}
	public void setP_email(String p_email) {
		this.p_email = p_email;
	}
	public List<Booking> getP_booking_list() {
		return p_booking_list;
	}
	public void setP_booking_list(List<Booking> p_booking_list) {
		this.p_booking_list = p_booking_list;
	}
}
