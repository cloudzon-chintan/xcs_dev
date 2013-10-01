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
@Table(name = "xc_userroombooking")
public class UserRoomBooking {

	@Id
	@Column(name = "userroombookingid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userRoomBookingId;

	@ManyToOne
	@JoinColumn(name = "userid")
	private UserMaster userId;

	@ManyToOne
	@JoinColumn(name = "roomid")
	private HotelRoom roomId;

	@Column(name = "startdate")
	private Date startDate;

	@Column(name = "enddate")
	private Date endDate;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@OneToMany(mappedBy = "userRoomBookingId")
	@Cascade(value = CascadeType.DELETE)
	private Set<UserRoomSelling> userRoomSellings;

	public int getUserRoomBookingId() {
		return userRoomBookingId;
	}

	public void setUserRoomBookingId(int userRoomBookingId) {
		this.userRoomBookingId = userRoomBookingId;
	}

	public UserMaster getUserId() {
		return userId;
	}

	public void setUserId(UserMaster userId) {
		this.userId = userId;
	}

	public HotelRoom getRoomId() {
		return roomId;
	}

	public void setRoomId(HotelRoom roomId) {
		this.roomId = roomId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public Set<UserRoomSelling> getUserRoomSellings() {
		return userRoomSellings;
	}

	public void setUserRoomSellings(Set<UserRoomSelling> userRoomSellings) {
		this.userRoomSellings = userRoomSellings;
	}
	
}
