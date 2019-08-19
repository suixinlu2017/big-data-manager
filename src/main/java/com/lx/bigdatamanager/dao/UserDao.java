package com.lx.bigdatamanager.dao;

import com.lx.bigdatamanager.model.dto.User;

import java.util.List;

/**
 * @program: big-data-manager
 * @description: test
 * @author: chenyulong
 * @create: 2019-08-01 16:29
 **/
public interface UserDao {
	User getUserById(Integer id);
	List<User> getUserList();
	int add(User user);
	int update(Integer id, User user);
	int delete(Integer id);
}
