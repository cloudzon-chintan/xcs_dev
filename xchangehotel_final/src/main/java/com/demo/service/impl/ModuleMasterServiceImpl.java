package com.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.demo.dao.ModuleMasterDao;
import com.demo.service.ModuleMasterService;

@Service("moduleMasterService")
public class ModuleMasterServiceImpl implements ModuleMasterService {

	@Resource(name = "moduleMasterDao")
	private ModuleMasterDao moduleMasterDao;
}
