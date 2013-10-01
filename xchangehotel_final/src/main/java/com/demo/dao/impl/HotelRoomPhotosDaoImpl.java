package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.HotelRoomPhotosDao;

@Repository("hotelRoomPhotosDao")
public class HotelRoomPhotosDaoImpl implements HotelRoomPhotosDao {
	
	@Autowired
	SessionFactory sessionFactory;
}
