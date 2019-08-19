package com.lx.bigdatamanager.service;

import com.lx.bigdatamanager.model.dto.BaseHouseDto;

/**
 * @author admin
 */
public interface HouseService {
	/**
	 * 根据楼盘ID查询楼盘详情
	 * @param id
	 * @return
	 */
	BaseHouseDto getHouseById(Long id);
}
