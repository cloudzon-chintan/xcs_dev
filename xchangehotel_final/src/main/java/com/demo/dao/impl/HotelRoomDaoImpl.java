package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.HotelRoomDao;

@Repository("hotelRoomDao")
public class HotelRoomDaoImpl implements HotelRoomDao {

	@Autowired
	SessionFactory sessionFactory;
}
