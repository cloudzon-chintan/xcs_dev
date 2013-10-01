package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.SaveSearchHistoryDao;

@Repository("saveSearchHistoryDao")
public class SaveSearchHistoryDaoImpl implements SaveSearchHistoryDao {
	
	@Autowired
	SessionFactory sessionFactory;
	
}
