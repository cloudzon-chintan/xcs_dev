package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.UserRoleDao;
import com.demo.service.UserRoleService;

@Service("userRoleService")
public class UserRoleServiceImpl implements UserRoleService {

	@Resource(name = "userRoleDao")
	private UserRoleDao userRoleDao;
}
