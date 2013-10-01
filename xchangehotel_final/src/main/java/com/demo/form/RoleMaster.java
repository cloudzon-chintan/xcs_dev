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
@Table(name = "xc_rolemaster")
public class RoleMaster {

	@Id
	@Column(name = "roleid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roleId;

	@Column(name = "rolename")
	private String roleName;

	@Column(name = "roletype")
	private int roleType;

	@Column(name = "createdby")
	private int createdBy;

	@Column(name = "createddate")
	private Date createdDate;

	@Column(name = "modifiedby")
	private int modifiedBy;

	@Column(name = "modifieddate")
	private Date modifiedDate;

	@OneToMany(mappedBy = "roleId")
	@Cascade(value = CascadeType.DELETE)
	private Set<UserRole> userRoles;

	@OneToMany(mappedBy = "roleId")
	@Cascade(value = CascadeType.DELETE)
	private Set<ModuleRole> moduleRoles;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getRoleType() {
		return roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
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

	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public Set<ModuleRole> getModuleRoles() {
		return moduleRoles;
	}

	public void setModuleRoles(Set<ModuleRole> moduleRoles) {
		this.moduleRoles = moduleRoles;
	}

}
