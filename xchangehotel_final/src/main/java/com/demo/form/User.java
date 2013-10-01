package com.demo.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "xc_usermaster")
public class User
{
	@Id
	@Column(name = "userid")
	@GeneratedValue
	private int userid;
	
	@NotBlank(message="User name is Required")
	@Column(name = "username")
	private String userName;
	
	@NotBlank(message="Gender is Required")
	@Column(name = "gender")
	private String gender;

	@NotBlank(message="First name is Required")
	@Column(name = "firstname")
	private String firstname ;

	@NotBlank(message="Middle name is Required")
	@Column(name = "middlename")
	private String middlename ;

	@NotBlank(message="Last name is Required")
	@Column(name = "lastname")
	private String lastname ;

	@NotBlank(message="Birthdate is Required")
	@Pattern(regexp = "((19|20)\\d{2})-([1-9]|0[1-9]|1[0-2])-(0[1-9]|[1-9]|[12][0-9]|3[01])" ,message= "Date formate is yyyy-mm-dd")
	@Column(name = "dob")
	private String dob;

	@NotBlank(message="Address is Required")
	@Column(name = "address")
	private String address ;

	@NotBlank(message="City is Required")
	@Column(name = "city")
	private String city ;

	@NotBlank(message="State is Required")
	@Column(name = "state")
	private String state ;

	@NotBlank(message="Counrty is Required")
	@Column(name = "country")
	private String country ;

	@Column(name = "pincode")
	private Long pincode ;
	
	
	@Column(name = "phonenumber")
	private Long phonenumber ;

	@Column(name = "faxnumber")
	private Long faxnumber;

	@Column(name = "mobilenumber")
	private Long mobilenumber;
	
	
	@NotBlank(message="Email is Required")
	@Email(message = "Not valid Email")
	@Column(name = "email")
	private String email;
	
	
	/*
	@Pattern(regexp="((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{8,40})",message="For e.g:jayesh999@P")
	@Size(min=8,message="Password must contain minimum 8 character")
	@NotBlank(message = "Password should not be blank.")
	*/
	@Column(name = "password")
	private String password ;

	@Transient
    private String retypePassword;
	
	@Column(name = "timezone")
	private String timezone;
	
	@Column(name ="SNSFLAG")
	private int SNSFLAG;
	
	@Column(name="SNSID")
	private String SNSID;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="timestamp")
	private Date timestamp;
	
	@Column(name="active")
	private int active;

	public User()
	{
		
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
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

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode == null ? 0 : pincode;
	}
	
	
	
	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber)
	{
		this.phonenumber = phonenumber == null ? 0 : phonenumber;
	}

	public Long getFaxnumber() {
		return faxnumber;
	}

	public void setFaxnumber(Long faxnumber)
	{
		this.faxnumber = faxnumber == null ? 0 : faxnumber;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber)
	{
		this.mobilenumber = mobilenumber == null ? 0 : mobilenumber;
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

	public void setPassword(String password) 
	{
		this.password = password;
	}
	
	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getSNSFLAG() {
		return SNSFLAG;
	}

	public void setSNSFLAG(int sNSFLAG) 
	{
		SNSFLAG = sNSFLAG;
	}

	public String getSNSID() {
		return SNSID;
	}

	public void setSNSID(String sNSID) {
		SNSID = sNSID;
	}


	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	
	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	@PrePersist
	protected void onCreate() {
		timestamp = new Date();
	}
}