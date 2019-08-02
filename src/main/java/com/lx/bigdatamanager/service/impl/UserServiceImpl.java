package com.lx.bigdatamanager.service.impl;

import com.lx.bigdatamanager.dao.UserDao;
import com.lx.bigdatamanager.model.dto.User;
import com.lx.bigdatamanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: big-data-manager
 * @description: test
 * @author: chenyulong
 * @create: 2019-08-01 16:35
 **/
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public User getUserById(Integer id) {
		return userDao.getUserById(id);
	}
	@Override
	public List<User> getUserList() {
		return userDao.getUserList();
	}
	@Override
	public int add(User user) {
		return userDao.add(user);
	}
	@Override
	public int update(Integer id, User user) {
		return userDao.update(id, user);
	}
	@Override
	public int delete(Integer id) {
		return userDao.delete(id);
	}
}
