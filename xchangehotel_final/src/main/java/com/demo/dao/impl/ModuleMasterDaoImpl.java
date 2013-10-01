package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.ModuleMasterDao;

@Repository("moduleMasterDao")
public class ModuleMasterDaoImpl implements ModuleMasterDao {
	@Autowired
	SessionFactory sessionFactory;
}
