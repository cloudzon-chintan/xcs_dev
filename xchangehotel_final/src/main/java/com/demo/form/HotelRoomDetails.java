package com.demo.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "xc_hotelroomdetails")
public class HotelRoomDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "roomdetailsid")
	private int roomDetailsId;

	@ManyToOne
	@JoinColumn(name = "roomid")
	private HotelRoom roomId;

	@Column(name = "amenitiestype")
	private String amenitiesType;

	@Column(name = "amenitiesdesc")
	private String amenitiesDesc;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "modifiedby")
	private int modifiedBy;

	@Column(name = "modifieddate")
	private Date modifiedDate;

	public int getRoomDetailsId() {
		return roomDetailsId;
	}

	public void setRoomDetailsId(int roomDetailsId) {
		this.roomDetailsId = roomDetailsId;
	}

	public HotelRoom getRoomId() {
		return roomId;
	}

	public void setRoomId(HotelRoom roomId) {
		this.roomId = roomId;
	}

	public String getAmenitiesType() {
		return amenitiesType;
	}

	public void setAmenitiesType(String amenitiesType) {
		this.amenitiesType = amenitiesType;
	}

	public String getAmenitiesDesc() {
		return amenitiesDesc;
	}

	public void setAmenitiesDesc(String amenitiesDesc) {
		this.amenitiesDesc = amenitiesDesc;
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

}
