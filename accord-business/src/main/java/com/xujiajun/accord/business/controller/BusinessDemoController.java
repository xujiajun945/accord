package com.xujiajun.accord.business.controller;

import com.xujiajun.accord.business.service.BusinessDemoService;
import com.xujiajun.accord.common.ResponseCodeEnum;
import com.xujiajun.accord.common.ResponseData;
import com.xujiajun.accord.common.ResponseException;
import com.xujiajun.accord.dto.BusinessDemoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@RestController
@RequestMapping(value = "/demo")
public class BusinessDemoController {

	@Autowired
	private BusinessDemoService businessDemoService;

	@GetMapping(value = "/{id}")
	public ResponseData getById(@PathVariable Long id) {
		BusinessDemoDTO businessDemoDTO = businessDemoService.getById(id);
		return new ResponseData(businessDemoDTO);
	}

	@GetMapping(value = "/exception")
	public ResponseData testException() {
		long currentTimeMillis = System.currentTimeMillis();
		if (currentTimeMillis % 2 == 0) {
			throw new ResponseException(ResponseCodeEnum.BAD_REQUEST);
		}
		return new ResponseData(currentTimeMillis);
	}
}
