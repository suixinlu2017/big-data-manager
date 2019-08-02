package com.lx.bigdatamanager;

import com.cloudera.impala.jdbc41.DataSource;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

/**
 * @program: big-data-manager
 * @description:
 * @author: chenyulong
 * @create: 2019-08-01 17:27
 **/
public class ssspTest extends TestCase {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = (DataSource) jdbcTemplate.getDataSource();
		System.out.println(dataSource.getConnection());
	}
}
