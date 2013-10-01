package com.demo.form;

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
@Table(name = "xc_modulemaster")
public class ModuleMaster {

	@Id
	@Column(name = "moduleid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int moduleId;

	@Column(name = "modulename")
	private String moduleName;

	@Column(name = "moduledescription")
	private String moduleDescription;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "modifiedby")
	private int modifiedBy;

	@Column(name = "modifieddate")
	private Date modifiedDate;

	@OneToMany(mappedBy = "moduleId")
	@Cascade(value=CascadeType.DELETE)
	private Set<ModuleRole> moduleRoles;

	public int getModuleId() {
		return moduleId;
	}

	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getModuleDescription() {
		return moduleDescription;
	}

	public void setModuleDescription(String moduleDescription) {
		this.moduleDescription = moduleDescription;
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

	public Set<ModuleRole> getModuleRoles() {
		return moduleRoles;
	}

	public void setModuleRoles(Set<ModuleRole> moduleRoles) {
		this.moduleRoles = moduleRoles;
	}

}
