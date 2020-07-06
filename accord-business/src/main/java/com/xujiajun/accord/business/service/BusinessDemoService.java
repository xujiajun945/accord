package com.xujiajun.accord.business.service;

import com.xujiajun.accord.dto.BusinessDemoDTO;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
public interface BusinessDemoService {

	/**
	 * business test
	 *
	 * @param id id
	 * @return dto
	 */
	BusinessDemoDTO getById(Long id);
}
