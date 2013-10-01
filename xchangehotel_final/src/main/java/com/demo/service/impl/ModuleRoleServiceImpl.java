package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.ModuleRoleDao;
import com.demo.service.ModuleRoleService;

@Service("moduleRoleService")
public class ModuleRoleServiceImpl implements ModuleRoleService{
	
	@Resource(name="moduleRoleDao")
	private ModuleRoleDao moduleRoleDao;
}
