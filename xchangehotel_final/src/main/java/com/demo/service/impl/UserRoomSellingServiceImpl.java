package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.UserRoomSellingDao;
import com.demo.service.UserRoomSellingService;

@Service("userRoomSellingService")
public class UserRoomSellingServiceImpl implements UserRoomSellingService {

	@Resource(name = "userRoomSellingDao")
	private UserRoomSellingDao userRoomSellingDao;
}
