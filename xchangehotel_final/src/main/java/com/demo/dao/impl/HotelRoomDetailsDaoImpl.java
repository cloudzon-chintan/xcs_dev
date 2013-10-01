package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.HotelRoomDetailsDao;

@Repository("hotelRoomDetailsDao")
public class HotelRoomDetailsDaoImpl implements HotelRoomDetailsDao {
	
	@Autowired
	SessionFactory sessionFactory;
}
