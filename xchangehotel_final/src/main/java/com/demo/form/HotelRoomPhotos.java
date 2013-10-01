package com.demo.form;

import java.sql.Blob;
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
@Table(name = "xc_hotelroomphotos")
public class HotelRoomPhotos {

	@Id
	@Column(name = "roomphotoid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roomPhotoId;

	@ManyToOne
	@JoinColumn(name = "roomid")
	private HotelRoom roomId;

	@Column(name = "photoname")
	private String photoName;

	@Column(name = "photodesc")
	private String photoDesc;

	@Column(name = "photo")
	private Blob photo;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "modifiedby")
	private int modifiedBy;

	@Column(name = "modifieddate")
	private Date modifiedDate;

	public int getRoomPhotoId() {
		return roomPhotoId;
	}

	public void setRoomPhotoId(int roomPhotoId) {
		this.roomPhotoId = roomPhotoId;
	}

	public HotelRoom getRoomId() {
		return roomId;
	}

	public void setRoomId(HotelRoom roomId) {
		this.roomId = roomId;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public String getPhotoDesc() {
		return photoDesc;
	}

	public void setPhotoDesc(String photoDesc) {
		this.photoDesc = photoDesc;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
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
