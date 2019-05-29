package com.sehyun.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringGradle1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringGradle1Application.class, args);
	}

}
