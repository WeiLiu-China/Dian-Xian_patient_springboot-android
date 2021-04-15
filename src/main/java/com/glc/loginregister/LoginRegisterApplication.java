package com.glc.loginregister;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class LoginRegisterApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LoginRegisterApplication.class, args);
	}

	// 不重写打包war部署到tomcat接口会报404
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LoginRegisterApplication.class);
	}

}
