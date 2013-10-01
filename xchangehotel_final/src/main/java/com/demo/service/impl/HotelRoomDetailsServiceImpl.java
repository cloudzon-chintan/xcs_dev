package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.HotelRoomDetailsDao;
import com.demo.service.HotelRoomDetailsService;

@Service("hotelRoomDetailsDaoService")
public class HotelRoomDetailsServiceImpl implements HotelRoomDetailsService {

	@Resource(name = "hotelRoomDetailsDao")
	private HotelRoomDetailsDao hotelRoomDetailsDao;
}
