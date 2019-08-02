package com.lx.bigdatamanager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * RESTful 接口文档配置
 *
 * @Author chenyulong
 * @Email 872626491@qq.com
 * @Date 2019/8/1
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.lx.bigdataadmin.controller"))
				.paths(PathSelectors.any())
				.build();

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("楼讯大数据后台管理")
				.description("")
				.termsOfServiceUrl("")
				.contact(new Contact("chenyulong", "http://www.louxun.com", "872626491@qq.com"))
				.version("1.0")
				.build();
	}
}
