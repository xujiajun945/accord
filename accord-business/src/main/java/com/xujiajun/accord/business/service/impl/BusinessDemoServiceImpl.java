package com.xujiajun.accord.business.service.impl;

import com.xujiajun.accord.business.dao.BusinessDemoMapper;
import com.xujiajun.accord.business.service.BusinessDemoService;
import com.xujiajun.accord.dto.BusinessDemoDTO;
import com.xujiajun.accord.model.BusinessDemo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Service
public class BusinessDemoServiceImpl implements BusinessDemoService {

	@Autowired
	private BusinessDemoMapper businessDemoMapper;

	@Override
	public BusinessDemoDTO getById(Long id) {
		BusinessDemo businessDemo = businessDemoMapper.getById(id);
		BusinessDemoDTO businessDemoDTO = new BusinessDemoDTO();
		BeanUtils.copyProperties(businessDemo, businessDemoDTO);
		return businessDemoDTO;
	}
}
