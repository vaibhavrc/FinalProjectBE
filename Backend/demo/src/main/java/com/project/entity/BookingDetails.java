package com.project.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingDetails {
	private int p_id;
	private int c_id;
	private int v_id;
	private LocalDate date;
	private LocalTime starTime;
	private LocalTime endTime;
	private int s_id;
	
	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public int getV_id() {
		return v_id;
	}

	public void setV_id(int v_id) {
		this.v_id = v_id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getStarTime() {
		return starTime;
	}

	public void setStarTime(LocalTime starTime) {
		this.starTime = starTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}		
}
