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
@Table(name = "xc_maillog")
public class MailLog {

	@Id
	@Column(name = "logid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int logId;

	@Column(name = "typeofmodule")
	private String typeOfModule;

	@Column(name = "fromid")
	private String fromId;

	@Column(name = "toid")
	private String toId;

	@ManyToOne
	@JoinColumn(name = "createdby")
	private UserMaster createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getTypeOfModule() {
		return typeOfModule;
	}

	public void setTypeOfModule(String typeOfModule) {
		this.typeOfModule = typeOfModule;
	}

	public String getFromId() {
		return fromId;
	}

	public void setFromId(String fromId) {
		this.fromId = fromId;
	}

	public String getToId() {
		return toId;
	}

	public void setToId(String toId) {
		this.toId = toId;
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
