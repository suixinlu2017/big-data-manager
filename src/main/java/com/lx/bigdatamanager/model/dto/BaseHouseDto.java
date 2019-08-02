package com.lx.bigdatamanager.model.dto;

import lombok.Data;

/**
 * @program: bigdata-admin
 * @description: 楼盘对象
 * @author: chenyulong
 * @create: 2019-08-01 09:30
 **/
@Data
public class BaseHouseDto {
	private long id;
	private String code;
	private String name;
	private String area_code;
	private String regist_name;
	private String house_aliasname;
	private String address;
	private int limit_year;
	private double longitude;
	private double latitude;
	private int titude_type;
	private int approve_status;
	private String approve_desc;
	private long create_date;
	private long create_id;
	private long update_date;
	private long update_id;
	private int delete_flag;
	private String remark;
	private String source;
	private String source_url;
	private int combined_flag;
	private long fixid;
	private String fixcode;
	private int type;
}
