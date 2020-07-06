package com.xujiajun.accord.base.controller;

import com.xujiajun.accord.base.service.DemoService;
import com.xujiajun.accord.common.BaseQuery;
import com.xujiajun.accord.common.Pager;
import com.xujiajun.accord.common.ResponseData;
import com.xujiajun.accord.vo.DemoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;

	@GetMapping(value = "/echo/{id}")
	public ResponseData getById(@PathVariable Long id) {
		DemoVO demoVO = demoService.demoTest(id);
		return new ResponseData(demoVO);
	}

	@GetMapping(value = "/list_all")
	public ResponseData listByIds() {
		List<DemoVO> demoVOList = demoService.listAll();
		return new ResponseData(demoVOList);
	}

	@GetMapping(value = "/page")
	public ResponseData pager(BaseQuery query) {
		Pager<DemoVO> pager = demoService.getPager(query);
		return new ResponseData(pager);
	}
}
