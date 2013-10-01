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
@Table(name = "xc_savesearchhistory")
public class SaveSearchHistory {

	@Id
	@Column(name = "searchhistoryid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int searchHistoryId;

	@Column(name = "priceflag")
	private short priceFlag;

	@Column(name = "pricerange")
	private int priceRange;

	@Column(name = "starrtingflag")
	private short starratingFlag;

	@Column(name = "starrating")
	private int starrating;

	@Column(name = "locationflag")
	private short locationFlag;

	@Column(name = "location")
	private String location;

	@ManyToOne
	@JoinColumn(name = "createdby")
	private UserMaster createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	public int getSearchHistoryId() {
		return searchHistoryId;
	}

	public void setSearchHistoryId(int searchHistoryId) {
		this.searchHistoryId = searchHistoryId;
	}

	public short getPriceFlag() {
		return priceFlag;
	}

	public void setPriceFlag(short priceFlag) {
		this.priceFlag = priceFlag;
	}

	public int getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(int priceRange) {
		this.priceRange = priceRange;
	}

	public short getStarratingFlag() {
		return starratingFlag;
	}

	public void setStarratingFlag(short starratingFlag) {
		this.starratingFlag = starratingFlag;
	}

	public int getStarrating() {
		return starrating;
	}

	public void setStarrating(int starrating) {
		this.starrating = starrating;
	}

	public short getLocationFlag() {
		return locationFlag;
	}

	public void setLocationFlag(short locationFlag) {
		this.locationFlag = locationFlag;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public UserMaster getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(UserMaster createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
