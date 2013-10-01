package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.UserRoomBookingDao;
import com.demo.service.UserRoomBookingService;

@Service("userRoomBookingService")
public class UserRoomBookingServiceImpl implements UserRoomBookingService {

	@Resource(name = "userRoomBookingDao")
	private UserRoomBookingDao userRoomBookingDao;
}
