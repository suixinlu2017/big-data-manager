package com.lx.bigdatamanager.utils;


import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @program: big-data-manager
 * @description: test
 * @author: chenyulong
 * @create: 2019-08-19 17:51
 **/
@Data
@ToString
public class UserVo {
	private Long age;
	private Integer name;
	private Date creatdate;
}
