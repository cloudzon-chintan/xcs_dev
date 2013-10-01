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
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "xc_usermaster")
public class UserMaster {

	@Id
	@Column(name = "userid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	@Column(name = "username")
	private String userName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "firstname")
	private String firstName;

	@Column(name = "middlename")
	private String middleName;

	@Column(name = "lastname")
	private String lastName;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pincode")
	private int pincode;

	@Column(name = "phonenumber")
	private BigInteger phoneNumber;

	@Column(name = "faxnumber")
	private BigInteger faxNumber;

	@Column(name = "mobilenumber")
	private BigInteger mobileNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "timezone")
	private String timeZone;

	@Column(name = "SNSFLAG")
	private short SNSFLAG;

	@Column(name = "SNSID")
	private String SNSID;

	@Column(name = "timestamp")
	private Date timeStamp;

	@Column(name = "active")
	private short active;

	@Transient
	private String retypePassword;

	@OneToMany(mappedBy = "createdBy")
	@Cascade(value = CascadeType.DELETE)
	private Set<MailLog> mailLogs;

	@OneToMany(mappedBy = "createdBy")
	@Cascade(value = CascadeType.DELETE)
	private Set<SaveSearchHistory> saveSearchHistories;

	@OneToMany(mappedBy = "userId")
	@Cascade(value = CascadeType.DELETE)
	private Set<UserRoomBooking> userRoomBookings;

	@OneToMany(mappedBy = "userId")
	@Cascade(value = CascadeType.DELETE)
	private Set<UserRole> userRoles;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public short getSNSFLAG() {
		return SNSFLAG;
	}

	public void setSNSFLAG(short sNSFLAG) {
		SNSFLAG = sNSFLAG;
	}

	public String getSNSID() {
		return SNSID;
	}

	public void setSNSID(String sNSID) {
		SNSID = sNSID;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public short getActive() {
		return active;
	}

	public void setActive(short active) {
		this.active = active;
	}

	public Set<MailLog> getMailLogs() {
		return mailLogs;
	}

	public void setMailLogs(Set<MailLog> mailLogs) {
		this.mailLogs = mailLogs;
	}

	public Set<SaveSearchHistory> getSaveSearchHistories() {
		return saveSearchHistories;
	}

	public void setSaveSearchHistories(
			Set<SaveSearchHistory> saveSearchHistories) {
		this.saveSearchHistories = saveSearchHistories;
	}

	public Set<UserRoomBooking> getUserRoomBookings() {
		return userRoomBookings;
	}

	public void setUserRoomBookings(Set<UserRoomBooking> userRoomBookings) {
		this.userRoomBookings = userRoomBookings;
	}

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

}
