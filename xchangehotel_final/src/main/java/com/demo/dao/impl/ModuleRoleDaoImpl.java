package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.ModuleRoleDao;

@Repository("moduleRoleDao")
public class ModuleRoleDaoImpl implements ModuleRoleDao {
	@Autowired
	SessionFactory sessionFactory;
}
