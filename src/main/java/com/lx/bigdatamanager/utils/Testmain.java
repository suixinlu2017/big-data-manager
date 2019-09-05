package com.lx.bigdatamanager.utils;

import com.lx.util.BeanMapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @program: big-data-manager
 * @description:
 * @author: chenyulong
 * @create: 2019-08-19 15:57
 **/
public class Testmain {
	public static void main(String[] args){
	    /*System.out.println();
	    String res = "fasfas,rqweqwe";
	    String[] sss = res.split(",");
	    System.out.println(sss.length);
		Arrays.stream(sss).forEach(s -> System.out.println(s));*/

	    /*UserDto userDto = new UserDto(321,"33333",1566208834000L);
	    UserVo userVo = BeanMapper.map(userDto,UserVo.class);
		Date date = new Date(userDto.getCreatdate());
		System.out.println("date = "+date);
	    System.out.println(userVo.toString());*/
	    // 时间也是可以从long转成data的，如果需要固定格式的String时间，则需要自己单独再转一次

		List<String> list = new ArrayList<String>();
		list.add("我");
		list.add("爱");
		list.add("中");
		list.add("国");

		// 增强for循环  无法获取下标
		for (String item : list){
			System.out.println(item);
		}

		//普通for循环   可以获取下标
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		//迭代器遍历  无法获取下标
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			System.out.println();
		}
	}
}
