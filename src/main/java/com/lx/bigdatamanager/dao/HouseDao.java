package com.lx.bigdatamanager.dao;

import com.lx.bigdatamanager.model.dto.BaseHouseDto;

/**
 * @author admin
 */
public interface HouseDao {
	/**
	 * 通过ID查询基础楼盘
	 * @param id
	 * @return
	 */
	BaseHouseDto getHouseById(Long id);
}
