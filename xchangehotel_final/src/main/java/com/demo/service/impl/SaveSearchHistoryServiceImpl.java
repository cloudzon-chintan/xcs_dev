package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.SaveSearchHistoryDao;
import com.demo.service.SaveSearchHistoryService;

@Service("saveSearchHistoryService")
public class SaveSearchHistoryServiceImpl implements SaveSearchHistoryService {

	@Resource(name = "saveSearchHistoryDao")
	private SaveSearchHistoryDao saveSearchHistoryDao;
}
