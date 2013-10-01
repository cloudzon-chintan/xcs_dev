package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.HotelRoomPhotosDao;
import com.demo.service.HotelRoomPhotosService;

@Service("hotelRoomPhotosService")
public class HotelRoomPhotosServiceImpl implements HotelRoomPhotosService {

	@Resource(name = "hotelRoomPhotosDao")
	private HotelRoomPhotosDao hotelRoomPhotosDao;
}
