package com.demo.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.HotelMasterDao;

@Repository("hotelMasterDao")
public class HotelMasterDaoImpl implements HotelMasterDao {

	@Autowired
	SessionFactory sessionFactory;
}
