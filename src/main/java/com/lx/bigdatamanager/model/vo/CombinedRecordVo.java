package com.lx.bigdatamanager.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: big-data-manager
 * @description: 合盘记录VO
 * @author: chenyulong
 * @create: 2019-08-19 14:12
 **/
@Data
public class CombinedRecordVo {
	@ApiModelProperty(value = "楼盘ID")
	private Long id;
	@ApiModelProperty(value = "楼盘编号")
	private String code;
	@ApiModelProperty(value = "楼盘名称")
	private String name;
	@ApiModelProperty(value = "楼盘区域编号")
	private String area_code;
	@ApiModelProperty(value = "楼盘注册名称")
	private String regist_name;
	@ApiModelProperty(value = "楼盘别名")
	private String house_aliasname;
	@ApiModelProperty(value = "数据源")
	private String source;
	@ApiModelProperty(value = "合盘标识:0 成功,1失败")
	private Integer combined_flag;
}
