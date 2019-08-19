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
	private Long id;
	private String code;
	private String name;
	private String area_code;
	private String regist_name;
	private String house_aliasname;
	private String address;
	private Integer limit_year;
	private Double longitude;
	private Double latitude;
	private Integer titude_type;
	private Integer approve_status;
	private String approve_desc;
	private Long create_date;
	private Long create_id;
	private Long update_date;
	private Long update_id;
	private Integer delete_flag;
	private String remark;
	private String source;
	private String source_url;
	private Integer combined_flag;
	private Long fixid;
	private String fixcode;
	private Integer type;
}
