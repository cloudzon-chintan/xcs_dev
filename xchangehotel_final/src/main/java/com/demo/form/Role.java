package com.demo.form;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "xc_modulerole")
public class Role
{
	@Column(name="roleid")
	private int roleid;
	
	@Column(name="rolename")
	private String rolename;
	
	@Column(name="roletype")
	private int roletype;
	
	 
	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public int getRoletype() {
		return roletype;
	}

	public Role(int roleid, String rolename, int roletype) {
		super();
		this.roleid = roleid;
		this.rolename = rolename;
		this.roletype = roletype;
	}

	public void setRoletype(int roletype) {
		this.roletype = roletype;
	}
}
