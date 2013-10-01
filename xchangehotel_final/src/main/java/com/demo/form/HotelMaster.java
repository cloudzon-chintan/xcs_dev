package com.demo.form;

import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "xc_hotelmaster")
public class HotelMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hotelid")
	private int hotelId;

	@Column(name = "hotelname")
	private String hotelName;

	@Column(name = "hotelbrand")
	private String hotelBrand;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "pincode")
	private int pincode;

	@Column(name = "country")
	private String country;

	@Column(name = "phonenumber")
	private BigInteger phoneNumber;

	@Column(name = "faxnumber")
	private BigInteger faxNumber;

	@Column(name = "mobilenumber")
	private BigInteger mobileNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "website")
	private String website;

	@Column(name = "latilude")
	private long latilude;

	@Column(name = "longitude")
	private long longitude;

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

	@OneToMany(mappedBy = "hotelId")
	@Cascade(value = CascadeType.DELETE)
	private Set<HotelRoom> hotelRooms;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelBrand() {
		return hotelBrand;
	}

	public void setHotelBrand(String hotelBrand) {
		this.hotelBrand = hotelBrand;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public BigInteger getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(BigInteger faxNumber) {
		this.faxNumber = faxNumber;
	}

	public BigInteger getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(BigInteger mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public long getLatilude() {
		return latilude;
	}

	public void setLatilude(long latilude) {
		this.latilude = latilude;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
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

	public Set<HotelRoom> getHotelRooms() {
		return hotelRooms;
	}

	public void setHotelRooms(Set<HotelRoom> hotelRooms) {
		this.hotelRooms = hotelRooms;
	}

}
