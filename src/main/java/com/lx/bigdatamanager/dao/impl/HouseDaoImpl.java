package com.lx.bigdatamanager.dao.impl;

import com.lx.bigdatamanager.dao.HouseDao;
import com.lx.bigdatamanager.model.dto.BaseHouseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 * @program: big-data-manager
 * @description: 楼盘持久层服务
 * @author: chenyulong
 * @create: 2019-08-16 11:36
 **/
@Repository
public class HouseDaoImpl implements HouseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * 通过ID查询基础楼盘
	 *
	 * @param id
	 * @return
	 */
	@Override
	public BaseHouseDto getHouseById(Long id) {
		String sql = "SELECT * FROM dws.dws_base_house WHERE dt = '201908152352' AND id = ?";
		RowMapper<BaseHouseDto> rowMapper= new BeanPropertyRowMapper<>(BaseHouseDto.class);
		BaseHouseDto baseHouseDto = jdbcTemplate.queryForObject(sql,rowMapper,id);
		return baseHouseDto;
	}
}
