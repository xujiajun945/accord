package com.xujiajun.accord.base.service.impl;

import com.xujiajun.accord.base.dao.DemoMapper;
import com.xujiajun.accord.base.service.DemoService;
import com.xujiajun.accord.common.BaseQuery;
import com.xujiajun.accord.common.Pager;
import com.xujiajun.accord.model.Demo;
import com.xujiajun.accord.vo.DemoVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xujiajun
 * @since 2020/7/1
 */
@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;

	@Override
	public DemoVO demoTest(Long id) {
		Demo demo = demoMapper.getById(id);
		DemoVO demoVO = new DemoVO();
		BeanUtils.copyProperties(demo, demoVO);
		return demoVO;
	}

	@Override
	public List<DemoVO> listAll() {
		return demoMapper.listAll()
			.stream()
			.map(demo -> {
				DemoVO demoVO = new DemoVO();
				BeanUtils.copyProperties(demo, demoVO);
				return demoVO;
			})
			.collect(Collectors.toList());
	}

	@Override
	public Pager<DemoVO> getPager(BaseQuery query) {
		Integer totalRows = demoMapper.countByQuery(query);
		Pager<DemoVO> pager = new Pager<>(query.getPage(), query.getRows(), totalRows);
		if (totalRows > 0) {
			query.setPosition(pager.position());
			List<DemoVO> demoList = demoMapper.listByQuery(query)
				.stream()
				.map(demo -> {
					DemoVO demoVO = new DemoVO();
					BeanUtils.copyProperties(demo, demoVO);
					return demoVO;
				})
				.collect(Collectors.toList());
			pager.setList(demoList);
		}
		return pager;
	}
}
