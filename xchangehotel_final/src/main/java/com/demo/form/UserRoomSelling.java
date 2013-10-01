package com.demo.form;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "xc_userroomselling")
public class UserRoomSelling {

	@Id
	@Column(name = "userroomsellingid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userRoomSellingId;

	@ManyToOne
	@JoinColumn(name = "userroombookingid")
	private UserRoomBooking userRoomBookingId;

	@Column(name = "cost")
	private double cost;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@OneToMany(mappedBy = "userRoomSellingId")
	@Cascade(value = CascadeType.DELETE)
	private Set<HotelRoom> hotelRooms;

	public int getUserRoomSellingId() {
		return userRoomSellingId;
	}

	public void setUserRoomSellingId(int userRoomSellingId) {
		this.userRoomSellingId = userRoomSellingId;
	}

	public UserRoomBooking getUserRoomBookingId() {
		return userRoomBookingId;
	}

	public void setUserRoomBookingId(UserRoomBooking userRoomBookingId) {
		this.userRoomBookingId = userRoomBookingId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Set<HotelRoom> getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(Set<HotelRoom> hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

}
