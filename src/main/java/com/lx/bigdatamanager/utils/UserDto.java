package com.lx.bigdatamanager.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: big-data-manager
 * @description: test
 * @author: chenyulong
 * @create: 2019-08-19 17:49
 **/
@Data
@AllArgsConstructor
public class UserDto {
	private Integer age;
	private String name;
	private Long creatdate;
}
