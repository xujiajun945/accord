package com.xujiajun.accord.business.dao;

import com.xujiajun.accord.model.BusinessDemo;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
public interface BusinessDemoMapper {

	/**
	 * getById
	 *
	 * @param id id
	 * @return model
	 */
	BusinessDemo getById(Long id);
}
