package cn.lhz.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EcsRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsRedisApplication.class, args);
	}

}
