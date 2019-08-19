package com.lx.bigdatamanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author admin
 */
@SpringBootApplication(scanBasePackages = {"com.lx"})
public class BigDataManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigDataManagerApplication.class, args);
	}

}
