package com.lx.bigdatamanager.controller;

import com.lx.bigdatamanager.model.JsonResult;
import com.lx.bigdatamanager.model.dto.User;
import com.lx.bigdatamanager.service.UserService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
// 获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
@SpringBootTest
// 让 JUnit 运行 Spring 的测试环境， 获得 Spring 环境的上下文的支持
@RunWith(SpringRunner.class)
public class UserControllerTest {
	@Autowired
	private UserService userService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getUserList() {
		JsonResult r = new JsonResult();
		try {
			List<User> users = userService.getUserList();
			r.setResult(users);
			r.setStatus("ok");
		} catch (Exception e) {
			r.setResult(e.getClass().getName() + ":" + e.getMessage());
			r.setStatus("error");
			e.printStackTrace();
		}
		System.out.println(r.getResult().toString());
	}
}
