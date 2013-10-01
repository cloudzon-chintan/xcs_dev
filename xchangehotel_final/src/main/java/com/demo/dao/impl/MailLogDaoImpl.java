package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.MailLogDao;

@Repository("mailLogDao")
public class MailLogDaoImpl implements MailLogDao{
	@Autowired
	SessionFactory sessionFactory;
}
