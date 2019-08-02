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
	public List<User> getUserList();
	public int add(User user);
	public int update(Integer id, User user);
	public int delete(Integer id);
}
