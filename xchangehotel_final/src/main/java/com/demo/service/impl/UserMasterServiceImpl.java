package com.demo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.UserMasterDao;
import com.demo.form.UserMaster;
import com.demo.service.UserMasterService;

@Service("userMasterService")
public class UserMasterServiceImpl implements UserMasterService {

	@Resource(name = "userMasterDao")
	private UserMasterDao userMasterDao;

	@Transactional
	public void registerUser(UserMaster userMaster) {
		this.userMasterDao.registerUser(userMaster);
	}

	@Transactional
	public List<UserMaster> getUsers(UserMaster userMaster) {
		return this.userMasterDao.getUsers(userMaster);
	}

	@Transactional
	public List<UserMaster> getUserList() {
		return this.userMasterDao.getUserList();
	}

	@Transactional
	public UserMaster varifyLogin(UserMaster userMaster) {
		return this.userMasterDao.varifyLogin(userMaster);
	}

	@Transactional
	public void verifyEmail(UserMaster userMaster) {
		this.userMasterDao.varifyEmail(userMaster);
	}

	@Transactional
	public UserMaster getUser(int id) {
		return this.userMasterDao.getUser(id);
	}

	@Transactional
	public void activeUser(UserMaster userMaster) {
		this.userMasterDao.activeUser(userMaster);
	}

}
