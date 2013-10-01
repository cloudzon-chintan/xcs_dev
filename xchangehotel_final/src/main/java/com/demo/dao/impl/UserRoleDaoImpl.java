package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.UserRoleDao;

@Repository("userRoleDao")
public class UserRoleDaoImpl implements UserRoleDao {
	@Autowired
	SessionFactory sessionFactory;
}
