package com.lx.bigdatamanager.controller;

import com.lx.bigdatamanager.model.JsonResult;
import com.lx.bigdatamanager.model.vo.BaseHouseVo;
import com.lx.bigdatamanager.model.vo.CombinedRecordVo;
import com.lx.bigdatamanager.service.HouseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

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
		//
		JsonResult jsonResult = new JsonResult();
		try {
			BaseHouseVo baseHouseVo = houseService.getHouseById(id);
			jsonResult.setResult(baseHouseVo);
			jsonResult.setStatus("ok");
		}catch (Exception e){
			jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
			jsonResult.setStatus("error");
			e.printStackTrace();
		}

		return ResponseEntity.ok(jsonResult);
	}

	@ApiOperation(value = "结果表-分页列表",httpMethod = "GET")
	@RequestMapping(value = "listByPage",method = RequestMethod.GET)
	public ResponseEntity<JsonResult> listByPage(){
		JsonResult jsonResult = new JsonResult();



		return ResponseEntity.ok(jsonResult);
	}

	@ApiOperation(value = "中间表-分页列表",httpMethod = "GET")
	@RequestMapping(value = "listIntermediateByPage",method = RequestMethod.GET)
	public ResponseEntity<JsonResult> listIntermediateByPage(){
		JsonResult jsonResult = new JsonResult();



		return ResponseEntity.ok(jsonResult);
	}

	@ApiOperation(value = "查看合盘记录",httpMethod = "GET")
	@RequestMapping(value = "listCombinedRecord",method = RequestMethod.GET)
	public ResponseEntity<JsonResult> listCombinedRecord(@RequestParam String source_url){
		//（需要根据source_url拆分之后，去查询源表数据展示）
		JsonResult jsonResult = new JsonResult();
		List<String> source_urls = Arrays.asList(source_url.split(","));
		// 拆分参数，查询
		List<CombinedRecordVo> combinedRecordVos = houseService.getResourceById(source_urls);


		return ResponseEntity.ok(jsonResult);
	}

	@ApiOperation(value = "拆盘操作",httpMethod = "POST")
	@RequestMapping(value = "uncombineHouse",method = RequestMethod.POST)
	public ResponseEntity<JsonResult> uncombineHouse(){
		// （拆分出来的数据，在源表的genid里有自己的id，直接拿过用，不要另外生成）
		JsonResult jsonResult = new JsonResult();

		return ResponseEntity.ok(jsonResult);
	}

	@ApiOperation(value = "合盘操作",httpMethod = "POST")
	@RequestMapping(value = "combineHouse",method = RequestMethod.POST)
	public ResponseEntity<JsonResult> combineHouse(){
		// （源表和结果表只查不改，增删查改都在中间表）
		JsonResult jsonResult = new JsonResult();

		return ResponseEntity.ok(jsonResult);
	}

	@ApiOperation(value = "根据ids获取楼盘列表",httpMethod = "POST")
	@RequestMapping(value = "getHouseByIds",method = RequestMethod.POST)
	public ResponseEntity<JsonResult> getHouseByIds(@RequestBody List<Integer> ids){
		// 合盘操作时跳转合盘操作页面调用 (合的是结果表里的数据，有可能是已经合过的，再和，，，也有可能是两个没有合过的独立楼盘，人为合成一起)
		JsonResult jsonResult = new JsonResult();


		try {
			return ResponseEntity.ok(jsonResult);
		} catch (Exception e) {
			jsonResult.setResult(e.getClass().getName() + ":" + e.getMessage());
			jsonResult.setStatus("error");
			e.printStackTrace();
		}
		return ResponseEntity.ok(jsonResult);
	}

}
