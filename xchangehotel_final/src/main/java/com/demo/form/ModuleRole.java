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
@Table(name = "xc_modulerole")
public class ModuleRole {

	@Id
	@Column(name = "moduleroleid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int moduleRoleId;

	@ManyToOne
	@JoinColumn(name = "roleid")
	private RoleMaster roleId;

	@ManyToOne
	@JoinColumn(name = "moduleid")
	private ModuleMaster moduleId;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "modifiedby")
	private int modifiedBy;

	@Column(name = "modifieddate")
	private Date modifiedDate;

	public int getModuleRoleId() {
		return moduleRoleId;
	}

	public void setModuleRoleId(int moduleRoleId) {
		this.moduleRoleId = moduleRoleId;
	}

	public RoleMaster getRoleId() {
		return roleId;
	}

	public void setRoleId(RoleMaster roleId) {
		this.roleId = roleId;
	}

	public ModuleMaster getModuleId() {
		return moduleId;
	}

	public void setModuleId(ModuleMaster moduleId) {
		this.moduleId = moduleId;
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
