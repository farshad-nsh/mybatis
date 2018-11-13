package com.farshad.weegle;

import com.farshad.weegle.model.Users;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MappedTypes(Users.class)
@MapperScan("com.farshad.weegle.mapper")
@SpringBootApplication
public class WeegleApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeegleApplication.class, args);
	}
}
