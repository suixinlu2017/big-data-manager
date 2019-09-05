package com.lx.bigdatamanager.model.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @program: big-data-manager
 * @description: 楼盘查询参数
 * @author: chenyulong
 * @create: 2019-09-05 09:55
 **/
@Data
public class HouseParams extends BaseParam {

	@ApiModelProperty(value = "数据源")
	private String source;
	@ApiModelProperty(value = "数据源地址")
	private String source_url;
	@ApiModelProperty(value = "楼盘名称")
	private String name;
	@ApiModelProperty(value = "楼盘区域编号")
	private String area_code;
	@ApiModelProperty(value = "楼盘别名")
	private String house_aliasname;
	@ApiModelProperty(value = "来源起始数量")
	private Integer source_start_count;
	@ApiModelProperty(value = "来源结束数量")
	private Integer source_end_count;
	@ApiModelProperty(value = "预售证号")
	private String budget_licence;

}
