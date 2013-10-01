package com.demo.form;

import java.sql.Time;
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
@Table(name = "xc_hotelroom")
public class HotelRoom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "roomid")
	private int roomId;

	@ManyToOne
	@JoinColumn(name = "hotelid")
	private HotelMaster hotelId;

	@Column(name = "category")
	private String category;

	@Column(name = "noofrooms")
	private int noOfRooms;

	@Column(name = "noofadults")
	private int noOfAdults;

	@Column(name = "noofchildren")
	private int noOfChildren;

	@Column(name = "checkintime")
	private Time checkInTime;

	@Column(name = "checkouttime")
	private Time checkOutTime;

	@Column(name = "cost")
	private int cost;

	@Column(name = "startdate")
	private Date startDate;

	@Column(name = "enddate")
	private Date endDate;

	@Column(name = "allocationstartdate")
	private Date allocationStartDate;

	@Column(name = "allocationenddate")
	private Date allocationEndDate;

	@ManyToOne
	@JoinColumn(name = "userroomsellingid")
	private UserRoomSelling userRoomSellingId;

	@Column(name = "userroomsellingflag")
	private short userRoomSellingFlag;

	@Column(name = "active")
	private short active;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "modifiedby")
	private int modifiedBy;

	@Column(name = "modifieddate")
	private Date modifiedDate;

	@OneToMany(mappedBy = "roomId")
	@Cascade(value = CascadeType.DELETE)
	private Set<UserRoomBooking> userRoomBookings;

	@OneToMany(mappedBy = "roomId")
	@Cascade(value = CascadeType.DELETE)
	private Set<HotelRoomDetails> hotelRoomDetails;

	@OneToMany(mappedBy = "roomId")
	@Cascade(value = CascadeType.DELETE)
	private Set<HotelRoomPhotos> hotelRoomPhotos;

	public Set<HotelRoomDetails> getHotelRoomDetails() {
		return hotelRoomDetails;
	}

	public void setHotelRoomDetails(Set<HotelRoomDetails> hotelRoomDetails) {
		this.hotelRoomDetails = hotelRoomDetails;
	}

	public Set<HotelRoomPhotos> getHotelRoomPhotos() {
		return hotelRoomPhotos;
	}

	public void setHotelRoomPhotos(Set<HotelRoomPhotos> hotelRoomPhotos) {
		this.hotelRoomPhotos = hotelRoomPhotos;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public HotelMaster getHotelId() {
		return hotelId;
	}

	public void setHotelId(HotelMaster hotelId) {
		this.hotelId = hotelId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}

	public Time getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Time checkInTime) {
		this.checkInTime = checkInTime;
	}

	public Time getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(Time checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
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

	public Date getAllocationStartDate() {
		return allocationStartDate;
	}

	public void setAllocationStartDate(Date allocationStartDate) {
		this.allocationStartDate = allocationStartDate;
	}

	public Date getAllocationEndDate() {
		return allocationEndDate;
	}

	public void setAllocationEndDate(Date allocationEndDate) {
		this.allocationEndDate = allocationEndDate;
	}

	public UserRoomSelling getUserRoomSellingId() {
		return userRoomSellingId;
	}

	public void setUserRoomSellingId(UserRoomSelling userRoomSellingId) {
		this.userRoomSellingId = userRoomSellingId;
	}

	public short getUserRoomSellingFlag() {
		return userRoomSellingFlag;
	}

	public void setUserRoomSellingFlag(short userRoomSellingFlag) {
		this.userRoomSellingFlag = userRoomSellingFlag;
	}

	public short getActive() {
		return active;
	}

	public void setActive(short active) {
		this.active = active;
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

	public int getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Set<UserRoomBooking> getUserRoomBookings() {
		return userRoomBookings;
	}

	public void setUserRoomBookings(Set<UserRoomBooking> userRoomBookings) {
		this.userRoomBookings = userRoomBookings;
	}
}
