package com.lx.bigdatamanager.utils;

/**
 * @program: bigdata-admin
 * @description:
 * @author: chenyulong
 * @create: 2019-07-31 14:39
 **/
import com.lx.bigdatamanager.model.dto.BaseHouseDto;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImpalaExample {
    public static void main(String[] args) throws Exception {
	    List<BaseHouseDto> list;
        //这个地址填写自己的impala server地址,默认端口为21050
        //格式为jdbc:impala://[Host]:[Port]/[Schema];[Property1]=[Value];[Property2]=[Value];...
        //默认连接default库
        String connectionUrl = "jdbc:impala://10.1.222.28:21050";
        //使用4.1版本
        String jdbcDriverName = "com.cloudera.impala.jdbc41.Driver";
        //简单的一个查询语句
        String sqlStatement = "select * from dws.dws_base_house where dt = '201907311556' order by id limit 10";
        //"show tables;";

        //加载驱动
        Class.forName(jdbcDriverName);
        try (Connection con = DriverManager.getConnection(connectionUrl)) {
            //查询
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sqlStatement);
            System.out.println("---begin query---");
	        list = mapRersultSetToObject(rs, BaseHouseDto.class);
            //打印输出
	        for (int i = 0; i < list.size(); i++) {
		        BaseHouseDto baseHouseDto = list.get(i);
		        System.out.println(baseHouseDto.toString());
	        }
            /*while (rs.next()) {
                System.out.println(rs.getString(2));
            }*/
            System.out.println("---end query---");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	/**
	 * 映射result为java的结果类
	 *
	 * @param rs
	 * @param outputClass
	 * @param <T>
	 * @return
	 */
	public static <T> List<T> mapRersultSetToObject(ResultSet rs, Class outputClass) {
		List<T> outputList = null;
		try {
			// make sure resultset is not null
			if (rs != null) {
				ResultSetMetaData rsmd = rs.getMetaData();
				Field[] fields = outputClass.getDeclaredFields();
				while (rs.next()) {
					T bean = (T) outputClass.newInstance();
					for (Field field : fields) {
						Object object = rs.getString(field.getName());
						BeanUtils.setProperty(bean, field.getName(), object);
					}
					if (outputList == null) {
						outputList = new ArrayList<T>();
					}
					outputList.add(bean);
				}
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return outputList;
	}
}
