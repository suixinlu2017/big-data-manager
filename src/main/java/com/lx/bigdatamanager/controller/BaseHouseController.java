package com.lx.bigdatamanager.controller;

import com.lx.bigdatamanager.model.JsonResult;
import com.lx.bigdatamanager.model.dto.BaseHouseDto;
import com.lx.bigdatamanager.service.HouseService;
import com.lx.bigdatamanager.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: big-data-manager
 * @description: 基础楼盘业务操作
 * @author: chenyulong
 * @create: 2019-08-16 11:03
 **/
@Slf4j
@RestController
@RequestMapping(value = "/houseManager", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
@Api(value = "大数据后台controller", tags = {"manager楼盘大数据"})
public class BaseHouseController {
	@Autowired
	private HouseService houseService;

	@ApiOperation(value = "查询详情",httpMethod = "GET")
	@RequestMapping(value = "getHouseById/{id}", method = RequestMethod.GET)
	public ResponseEntity<JsonResult> getHouseById (@PathVariable(value = "id") Long id){
		JsonResult jsonResult = new JsonResult();
		try {
			BaseHouseDto baseHouseDto = houseService.getHouseById(id);
			jsonResult.setResult(baseHouseDto);
			jsonResult.setStatus("ok");
		}catch (Exception e){
			jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
			jsonResult.setStatus("error");
			e.printStackTrace();
		}

		return ResponseEntity.ok(jsonResult);
	}

	// API 获取楼盘列表

	// 查看中间表列表

	// 根据ID删除中间表数据

	// 查看合盘记录（需要根据source_url拆分之后，去查询源表数据展示）

	// 拆盘操作（）
}
