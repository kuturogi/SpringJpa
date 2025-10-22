package com.bertugkuturoglu.spring_jpa;

import com.bertugkuturoglu.configuration.GlobalProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.bertugkuturoglu"})
@ComponentScan(basePackages = {"com.bertugkuturoglu"})
@EnableJpaRepositories(basePackages = {"com.bertugkuturoglu"})
@EnableConfigurationProperties(value = GlobalProperties.class)
public class SpringJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
