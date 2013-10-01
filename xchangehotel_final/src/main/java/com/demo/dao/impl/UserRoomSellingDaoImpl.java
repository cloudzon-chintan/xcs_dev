package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.UserRoomSellingDao;

@Repository("userRoomSellingDao")
public class UserRoomSellingDaoImpl implements UserRoomSellingDao {
	@Autowired
	SessionFactory sessionFactory;
}
