package com.lx.bigdatamanager.dao.impl;

import com.lx.bigdatamanager.dao.UserDao;
import com.lx.bigdatamanager.model.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * @program: big-data-manager
 * @description: test
 * @author: chenyulong
 * @create: 2019-08-01 16:30
 **/
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Async
	public CompletableFuture<List<Map<String, Object>>> queryAsync(String sql){
		Long startTime;
		Long endTime;
		List<Map<String, Object>> result;
		startTime = System.currentTimeMillis();
		result = jdbcTemplate.queryForList(sql);
		endTime = System.currentTimeMillis();
		Map<String, Object> map = new HashMap<>();
		map.put("queryTime", endTime-startTime);
		result.add(map);
		return CompletableFuture.completedFuture(result);
	}

	public List<Map<String, Object>> querySync(String sql){
		return jdbcTemplate.queryForList(sql);
	}

	//这个是系统自带的
	@Override
	public User getUserById(Integer id) {
		String sql = "select * from tb_user where id = ?";
		RowMapper<User> rowMapper= new BeanPropertyRowMapper<>(User.class);
		User user = jdbcTemplate.queryForObject(sql,rowMapper,id);
		System.out.println("===user=="+user.toString());
		/*List<Map<String, Object>> mapList = jdbcTemplate.queryForList(sql);
		for (int i = 0; i < mapList.size(); i++) {
			Map<String, Object> map = mapList.get(i);
			System.out.println(map.toString());
		}*/
		/*List<User> list = jdbcTemplate.query("select * from tb_user where id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
		if(list!=null && list.size()>0){
			return list.get(0);
		}else{
			return null;
		}*/
		return null;
	}

	@Override
	public List<User> getUserList() {
		List<User> list = jdbcTemplate.query("select * from tb_user", new Object[]{}, new BeanPropertyRowMapper(User.class));
		if(list!=null && list.size()>0){
			return list;
		}else{
			return null;
		}
	}

	@Override
	public int add(User user) {
		return jdbcTemplate.update("insert into tb_user(username, age, ctm) values(?, ?, ?)",
				user.getUsername(),user.getAge(), new Date());
	}

	@Override
	public int update(Integer id, User user) {
		return jdbcTemplate.update("UPDATE tb_user SET username = ? , age = ? WHERE id=?",
				user.getUsername(),user.getAge(), id);
	}

	@Override
	public int delete(Integer id) {
		return jdbcTemplate.update("DELETE from tb_user where id = ? ",id);
	}

}
