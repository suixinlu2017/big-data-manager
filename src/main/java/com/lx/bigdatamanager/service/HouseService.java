package com.lx.bigdatamanager.service;

import com.lx.bigdatamanager.model.vo.BaseHouseVo;
import com.lx.bigdatamanager.model.vo.CombinedRecordVo;

import java.util.List;

/**
 * @author admin
 */
public interface HouseService {
	/**
	 * 根据楼盘ID查询楼盘详情
	 * @param id
	 * @return
	 */
	BaseHouseVo getHouseById(Long id);

	/**
	 * 查询源表的记录表
	 * @param source_urls
	 * @return
	 */
	List<CombinedRecordVo> getResourceById(List<String> source_urls);
}
