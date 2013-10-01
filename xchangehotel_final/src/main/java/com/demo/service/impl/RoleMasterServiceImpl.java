package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.RoleMasterDao;
import com.demo.service.RoleMasterService;

@Service("roleMasterService")
public class RoleMasterServiceImpl implements RoleMasterService {

	@Resource(name = "roleMasterDao")
	private RoleMasterDao roleMasterDao;
}
