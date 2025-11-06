package com.example.demo;

import io.awspring.cloud.sqs.annotation.SqsListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@SqsListener("zaobao-com.fifo")
	public void listen(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
