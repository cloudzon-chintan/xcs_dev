package com.demo.service;

import java.util.List;

import com.demo.form.UserMaster;

public interface UserMasterService {
	public void registerUser(UserMaster userMaster);

	public List<UserMaster> getUsers(UserMaster userMaster);

	public List<UserMaster> getUserList();

	public UserMaster varifyLogin(UserMaster userMaster);

	public void verifyEmail(UserMaster userMaster);

	public UserMaster getUser(int id);

	public void activeUser(UserMaster userMaster);
}
