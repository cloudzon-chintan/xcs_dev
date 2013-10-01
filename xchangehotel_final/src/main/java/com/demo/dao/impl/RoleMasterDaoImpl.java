package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.RoleMasterDao;

@Repository("roleMasterDao")
public class RoleMasterDaoImpl implements RoleMasterDao {
	@Autowired
	SessionFactory sessionFactory;
}
