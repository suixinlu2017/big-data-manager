package com.lx.bigdatamanager.model.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;
import java.io.Serializable;

/**
 * @program: big-data-manager
 * @description: 分页基础类
 * @author: chenyulong
 * @create: 2019-09-05 09:50
 **/
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseParam implements Serializable {

	@ApiModelProperty(value = "分页-页号")
	@Transient
	private int pageNo;

	@ApiModelProperty(value = "分页-每页大小（默认10条）")
	@Transient
	private int pageSize = 10;
}
