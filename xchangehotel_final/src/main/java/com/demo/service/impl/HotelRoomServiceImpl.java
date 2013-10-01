package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.HotelRoomDao;
import com.demo.service.HotelRoomService;

@Service("hotelRoomService")
public class HotelRoomServiceImpl implements HotelRoomService {

	@Resource(name = "hotelRoomDao")
	private HotelRoomDao hotelRoomDao;
}
