package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.UserRoomBookingDao;

@Repository("userRoomBookingDao")
public class UserRoomBookingDaoImpl implements UserRoomBookingDao {
	@Autowired
	SessionFactory sessionFactory;
}
