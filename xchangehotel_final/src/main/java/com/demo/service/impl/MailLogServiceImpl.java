package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.MailLogDao;
import com.demo.service.MailLogService;

@Service("mailLogService")
public class MailLogServiceImpl implements MailLogService {

	@Resource(name = "mailLogDao")
	private MailLogDao mailLogDao;
}
