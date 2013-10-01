package com.demo.dao;

import java.util.List;

import com.demo.form.UserMaster;

public interface UserMasterDao {
	public void registerUser(UserMaster userMaster);

	public List<UserMaster> getUsers(UserMaster userMaster);

	public List<UserMaster> getUserList();

	public UserMaster varifyLogin(UserMaster userMaster);

	public void varifyEmail(UserMaster userMaster);

	public UserMaster getUser(int id);

	public void activeUser(UserMaster userMaster);
}
