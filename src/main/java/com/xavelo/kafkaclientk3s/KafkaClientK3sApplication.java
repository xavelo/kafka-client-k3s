package com.xavelo.kafkaclientk3s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:git.properties")
public class KafkaClientK3sApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaClientK3sApplication.class, args);
	}

}
