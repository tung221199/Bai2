package com.example.Bai2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.SystemEnvironmentPropertySource;

@SpringBootApplication
//@EnableConfigurationProperties({Bai2Application.config.class})
public class Bai2Application {

	public static void main(String[] args) {
		SpringApplication.run(Bai2Application.class, args);
	}

//	@Value("${tung.config}")
//	private String value;

//	@ConfigurationProperties(prefix = "tung")
//	public class config{
//		private String config;
//		SystemEnvironmentPropertySource.get
//	}
}
