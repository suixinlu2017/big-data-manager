package com.lx.bigdatamanager.model;

import lombok.Data;

/**
 * @program: big-data-manager
 * @description: test
 * @author: chenyulong
 * @create: 2019-08-01 16:36
 **/
@Data
public class JsonResult {
	/** 返回的数据 */
	private String status = null;
	/** 返回的状态 */
	private Object result = null;

	/**
	 * 注意方法名是可以与属性名同名的。
	 * @param status
	 * @return
	 */
	public JsonResult status(String status) {
		this.status = status;
		return this;
	}
}
