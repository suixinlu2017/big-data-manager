package com.lx.bigdatamanager.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @program: big-data-manager
 * @description: Presto配置类
 * @author: chenyulong
 * @create: 2019-08-01 20:16
 **/
//@Configuration
public class GlobalDataSourceConfiguration {
	private static Logger LOG = LoggerFactory.getLogger(GlobalDataSourceConfiguration.class);

	@Bean(name = "prestoDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.presto")
	public DataSource prestoDataSource() {
		LOG.info("-------------------- presto init ---------------------");
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "prestoTemplate")
	public JdbcTemplate prestoJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
}
