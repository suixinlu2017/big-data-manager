package com.lx.bigdatamanager.service.impl;

import com.lx.bigdatamanager.dao.HouseDao;
import com.lx.bigdatamanager.dao.UserDao;
import com.lx.bigdatamanager.model.dto.BaseHouseDto;
import com.lx.bigdatamanager.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: big-data-manager
 * @description: 基础楼盘实现
 * @author: chenyulong
 * @create: 2019-08-16 11:25
 **/
@Service
public class HouseServiceImpl implements HouseService {
	@Autowired
	private HouseDao houseDao;

	/**
	 * 根据楼盘ID查询楼盘详情
	 *
	 * @param id
	 * @return
	 */
	@Override
	public BaseHouseDto getHouseById(Long id) {
		return houseDao.getHouseById(id);
	}
}
