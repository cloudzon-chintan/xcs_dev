package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.HotelMasterDao;
import com.demo.service.HotelMasterService;

@Service("hotelMasterService")
public class HotelMasterServiceImpl implements HotelMasterService {

	@Resource(name = "hotelMasterDao")
	private HotelMasterDao hotelMasterDao;
	
}
