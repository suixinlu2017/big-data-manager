package com.lx.bigdatamanager.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @program: big-data-manager
 * @description: 楼盘可视化对象
 * @author: chenyulong
 * @create: 2019-08-19 16:16
 **/
@Data
public class BaseHouseVo {
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
	@ApiModelProperty(value = "楼盘地址")
	private String address;
	@ApiModelProperty(value = "产权年限")
	private Integer limit_year;
	@ApiModelProperty(value = "经度")
	private Double longitude;
	@ApiModelProperty(value = "纬度")
	private Double latitude;
	@ApiModelProperty(value = "楼盘编号")
	private Integer titude_type;
	@ApiModelProperty(value = "审批状态")
	private Integer approve_status;
	@ApiModelProperty(value = "审批描述")
	private String approve_desc;
	@ApiModelProperty(value = "创建时间")
	private Date create_date;
	@ApiModelProperty(value = "创建人")
	private Long create_id;
	@ApiModelProperty(value = "更新时间")
	private Date update_date;
	@ApiModelProperty(value = "修改人")
	private Long update_id;
	@ApiModelProperty(value = "删除标识(0:有效,1:无效)")
	private Integer delete_flag;
	@ApiModelProperty(value = "备注")
	private String remark;
	@ApiModelProperty(value = "数据源")
	private String source;
	@ApiModelProperty(value = "数据源地址")
	private String source_url;
	@ApiModelProperty(value = "合盘标识:0 成功,1失败")
	private Integer combined_flag;
	@ApiModelProperty(value = "合盘后ID")
	private Long fixid;
	@ApiModelProperty(value = "合盘后编码")
	private String fixcode;
	@ApiModelProperty(value = "楼盘类型：0:新房，1:二手房，2:新房和二手房")
	private Integer type;
}
