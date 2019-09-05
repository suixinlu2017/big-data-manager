package com.lx.bigdatamanager.service.impl;

import com.lx.bigdatamanager.dao.HouseDao;
import com.lx.bigdatamanager.model.dto.BaseHouseDto;
import com.lx.bigdatamanager.model.vo.BaseHouseVo;
import com.lx.bigdatamanager.model.vo.CombinedRecordVo;
import com.lx.bigdatamanager.service.HouseService;
import com.lx.util.BeanMapper;
import com.lx.util.CommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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
	public BaseHouseVo getHouseById(Long id) {

		BaseHouseDto baseHouseDto = houseDao.getHouseById(id);
		BaseHouseVo baseHouseVo = BeanMapper.map(baseHouseDto,BaseHouseVo.class);

		if (CommonUtil.isNotNull(baseHouseDto.getCreate_date())) {
			baseHouseVo.setCreate_date(new Date(baseHouseDto.getCreate_date()));
		}
		if (CommonUtil.isNotNull(baseHouseDto.getUpdate_date())) {
			baseHouseVo.setUpdate_date(new Date(baseHouseDto.getUpdate_date()));
		}
		return baseHouseVo;
	}

	/**
	 * 查询源表的记录表
	 *
	 * @param source_urls
	 * @return
	 */
	@Override
	public List<CombinedRecordVo> getResourceById(List<String> source_urls) {
		return null;
	}
}
