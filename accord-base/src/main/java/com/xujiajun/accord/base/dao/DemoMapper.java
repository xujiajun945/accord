package com.xujiajun.accord.base.dao;

import com.xujiajun.accord.common.BaseQuery;
import com.xujiajun.accord.model.Demo;

import java.util.List;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
public interface DemoMapper {

	/**
	 * demo
	 *
	 * @param id id
	 * @return demo
	 */
	Demo getById(Long id);

	/**
	 * 获取全部
	 *
	 * @return list
	 */
	List<Demo> listAll();

	/**
	 * 查询条件满足的条数
	 *
	 * @param query 查询条件
	 * @return 满足的条数
	 */
	Integer countByQuery(BaseQuery query);

	/**
	 * 查询条件满足的list
	 *
	 * @param query 查询条件
	 * @return list
	 */
	List<Demo> listByQuery(BaseQuery query);
}
