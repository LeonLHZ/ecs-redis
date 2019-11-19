package cn.lhz.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class EcsRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsRedisApplication.class, args);
	}

}
