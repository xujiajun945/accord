package com.xujiajun.accord.base.service;

import com.xujiajun.accord.common.BaseQuery;
import com.xujiajun.accord.common.Pager;
import com.xujiajun.accord.vo.DemoVO;

import java.util.List;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
public interface DemoService {

	/**
	 * demo
	 *
	 * @param id id
	 * @return demo
	 */
	DemoVO demoTest(Long id);

	/**
	 * 获取全部
	 *
	 * @return list
	 */
	List<DemoVO> listAll();

	/**
	 * 分页测试
	 *
	 * @param query 查询对象
	 * @return pager
	 */
	Pager<DemoVO> getPager(BaseQuery query);
}
